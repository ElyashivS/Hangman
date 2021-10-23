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
        for (int i = 0; i < blankWord.length(); i++) { // Check if the letter is in the word
            if (word.charAt(i) == guess) {
                blankWord = blankWord.substring(0, i) +
                        guess + blankWord.substring(i + 1);
            }
        }
        return blankWord;
    }

    public boolean isGameOn() {
        return blankWord.indexOf('_') != -1;
    }
}
