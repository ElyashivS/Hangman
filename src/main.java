import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean gameOn = true;
        Words a = new Words(new String[]{"sevenfold", "united"});
        ChosenWord chosenWord = new ChosenWord(a.getRandomWord());
        System.out.println(chosenWord.printUnderScores());

        while (gameOn) {
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("Guess a letter:");
            char guess = scan.next().charAt(0);
            int index = chosenWord.getWord().indexOf(guess);

            if (index != -1) { // Check if the letter is in the word
                char rightLetter = chosenWord.getWord().charAt(index);
                String afterGuess;
                afterGuess = chosenWord.printUnderScores().substring(0, index) + rightLetter + chosenWord.printUnderScores().substring(index + 1);
                System.out.println(afterGuess);
            }
        }
    }
}
