public class ChosenWord {

    private String word;

    public String getWord() {
        return word;
    }

    public ChosenWord(String word) {
        this.word = word;
    }

    public String printUnderScores() {
        String newWord = "_".repeat(word.length());
        return newWord;
    }
}
