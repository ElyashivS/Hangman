public class ChosenWord {

    private final String word;
    private String blankWord;

    public String getWord() {
        return blankWord;
    }

    public ChosenWord(String word) {
        this.word = word;
        this.blankWord = word;
        blankWord = blankWord.replaceAll("[a-zA-Z]", "_");
    }

    public void playerGuess(char guess) {
        for (int i = 0; i < blankWord.length(); i++) { // Check if the letter is in the word
            if (word.charAt(i) == Character.toLowerCase(guess) ||
                    word.charAt(i) == Character.toUpperCase(guess)) {
                blankWord = blankWord.substring(0, i) +
                        word.charAt(i) + blankWord.substring(i + 1);
            }
        }
    }

    public boolean isGameOn() {
        return blankWord.indexOf('_') != -1;
    }

    public String leftLetters() {
        StringBuilder unChosen = new StringBuilder();
        char c;
        for(c = 'a'; c <= 'z'; ++c)
            unChosen.append(c).append(" ");
        return unChosen.toString();
    }
}
