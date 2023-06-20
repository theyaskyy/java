package game;

import java.util.Random;

public class GuessingGame {
    private NumberGenerator numberGenerator;

    public GuessingGame(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public GameResult makeGuess(int guess) {
        int secretNumber = numberGenerator.getSecretNumber();

        if (guess < secretNumber) {
            return GameResult.TOO_LOW;
        } else if (guess > secretNumber) {
            return GameResult.TOO_HIGH;
        } else {
            return GameResult.CORRECT;
        }
    }
}
