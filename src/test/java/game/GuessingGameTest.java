package game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessingGameTest {

    private static class TestNumberGenerator extends NumberGenerator {
        private int secretNumber;

        public TestNumberGenerator(int secretNumber) {
            this.secretNumber = secretNumber;
        }

        @Override
        public int getSecretNumber() {
            return secretNumber;
        }
    }

    @Test
    public void testGuessingGame() {
        int secretNumber = 50;
        NumberGenerator numberGenerator = new TestNumberGenerator(secretNumber);

        GuessingGame game = new GuessingGame(numberGenerator);

        assertEquals(GameResult.TOO_HIGH, game.makeGuess(70));
        assertEquals(GameResult.TOO_LOW, game.makeGuess(30));
        assertEquals(GameResult.CORRECT, game.makeGuess(secretNumber));
    }
}
