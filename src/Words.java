import java.util.Random;

public class Words {

    private String[] words;

    public Words(String[] words) {
        this.words = words;
    }

    public String getRandomWord() {
        Random r = new Random();
        return words[r.nextInt(words.length)];
    }
}
