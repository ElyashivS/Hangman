public class ChosenWord {

    private final String word;
    private String blankWord;

    public String getWord() {
        return blankWord;
    }

    public ChosenWord(String word) {
        this.word = word;
        this.blankWord = "_".repeat(word.length());
    }

    public String playerGuess(char guess) {

        int index = word.indexOf(guess); // Index of guess. -1 if not in the word
        if (index != -1) { // Check if the letter is in the word
            char rightLetter = word.charAt(index);
            blankWord = blankWord.substring(0, index) +
                    rightLetter + blankWord.substring(index + 1);
        }
        return blankWord;
    }

    public boolean isGameOn() {
        return blankWord.indexOf('_') != -1;
    }
}