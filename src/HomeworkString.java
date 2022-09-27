import java.util.List;

public class HomeworkString {

    private final List<String> words;

    public HomeworkString(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public void printUniqueWords(List<String> wordList) {

        for (String word : wordList) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
