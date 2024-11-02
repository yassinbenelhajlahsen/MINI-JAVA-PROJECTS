import java.util.Random;
import java.util.Scanner;

public class Hangman {

    static String selectedWord;

    static String pickRandomWord() {
        String[] wordBank = {"apple", "banana", "cherry", "dog", "eleven", "fox", "grape", "happy", "ice", "java"};
        Random random = new Random();
        int ranInt = random.nextInt(10);
        return wordBank[ranInt];
    }

    static String initializeLetters() {
        return "x".repeat(selectedWord.length());
    }

    static void game() {
        int guesses = selectedWord.length();
        String currentLetters = initializeLetters();

        while (guesses > 0 && currentLetters.contains("x")) {
            System.out.print("Enter your guess: ");
            Scanner input = new Scanner(System.in);
            String playerGuess = input.next();

            if (playerGuess.length() != 1) {
                System.out.println("Error. Enter only 1 letter.");
                continue;
            }

            char charAtGuess = playerGuess.charAt(0);

            if (selectedWord.contains(playerGuess)) {
                int indexOfGuess = selectedWord.indexOf(charAtGuess);

                char[] charArray = currentLetters.toCharArray();
                while (indexOfGuess != -1) {
                    charArray[indexOfGuess] = charAtGuess;
                    indexOfGuess = selectedWord.indexOf(charAtGuess, indexOfGuess + 1);
                }

                currentLetters = new String(charArray);
                System.out.println(currentLetters);
            } else {
                System.out.println("Nope! ");
                System.out.println(currentLetters);
                guesses--;
            }
        }

        if (!currentLetters.contains("x")) {
            System.out.println("Congratulations! You guessed the word: " + selectedWord);
        } else {
            System.out.println("Sorry! You ran out of guesses. The word was: " + selectedWord);
        }
    }

    public static void main(String[] args) {
        selectedWord = pickRandomWord();
        System.out.println("Hi! Welcome to Yassin's Hangman game. You will have: " + selectedWord.length() + " guesses.");
        game();
    }
}
