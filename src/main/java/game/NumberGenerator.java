package game;

import java.util.Random;

public class NumberGenerator {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private Random random;
    private int secretNumber;

    public NumberGenerator() {
        random = new Random();
        secretNumber = generateNumber();
    }

    public int generateNumber() {
        return random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
