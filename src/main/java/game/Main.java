package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy GuessingGame
        NumberGenerator numberGenerator = new NumberGenerator();
        GuessingGame game = new GuessingGame(numberGenerator);

        // Rozpoczęcie gry
        System.out.println("Gra w zgadywanie liczby!");
        System.out.println("Wylosowano liczbę z zakresu 1-100.");
        System.out.println("Spróbuj zgadnąć!");

        // Pobieranie zgadnięć od użytkownika
        Scanner scanner = new Scanner(System.in);
        boolean correctGuess = false;

        while (!correctGuess) {
            System.out.print("Podaj liczbę: ");
            int guess = scanner.nextInt();

            // Wywołanie metody makeGuess i wyświetlenie wyniku
            GameResult result = game.makeGuess(guess);

            if (result == GameResult.TOO_LOW) {
                System.out.println("Za niska liczba.");
            } else if (result == GameResult.TOO_HIGH) {
                System.out.println("Za wysoka liczba.");
            } else {
                System.out.println("Gratulacje! Zgadłeś liczbę!");
                correctGuess = true;
            }
        }

        // Zakończenie gry
        System.out.println("Dziękujemy za grę!");
        scanner.close();
    }
}
