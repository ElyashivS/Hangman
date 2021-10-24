import java.util.Scanner;
import java.util.regex.Pattern;

public class Driver {
    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            boolean gameOn = true;

            // Setup
            String[] string = new String[]{"Avenged Sevenfold", "aAaBbB"};
            Words words = new Words(string);
            ChosenWord chosenWord = new ChosenWord(words.getRandomWord());
            String unChosen = chosenWord.leftLetters();
            int counter = 0;

            // Running
            while (gameOn) {
                System.out.println("You can choose:\n" + unChosen);
                System.out.println(chosenWord.getWord());

                Scanner scan = new Scanner(System.in);
                System.out.println("Guess a letter:");
                // TODO Check input that contain more than 1 letter
                char guess = scan.next().charAt(0);
                guess = Character.toLowerCase(guess);
                boolean matches = Pattern.matches("[a-zA-Z]", String.valueOf(guess));
                if (!matches) {
                    System.out.println("Please enter letter from A to Z");
                }
                else if (unChosen.indexOf(guess) == -1) {
                    System.out.println("You already guessed " + guess + ". Please guess another letter");
                    counter--;
                }
                chosenWord.playerGuess(guess);

                if (matches) {
                    unChosen = unChosen.replaceAll(guess + " ", "");
                    counter++;
                }

                if (counter != 0) {
                    System.out.println("It was your " + counter + " guess");
                }
                gameOn = chosenWord.isGameOn();
            }

            System.out.println(chosenWord.getWord());
            System.out.println("Good job :) You win");
            System.out.println("Press 1 to start a new game.\npress any other key to exit");
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            if (!input.equals("1")) {
                run = false;
            }
        }
    }
}
