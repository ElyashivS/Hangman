import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean gameOn = true;

        String[] string = new String[]{"likush","united"};
        Words words = new Words(string);
        ChosenWord chosenWord = new ChosenWord(words.getRandomWord());

        while (gameOn) {
            System.out.println(chosenWord.getWord());
            Scanner scan = new Scanner(System.in);
            System.out.println("Guess a letter:");
            char guess = scan.next().charAt(0);
            chosenWord.playerGuess(guess);
            gameOn = chosenWord.isGameOn();
        }
        System.out.println(chosenWord.getWord());
        System.out.println("Good job :) You win");
    }
}
