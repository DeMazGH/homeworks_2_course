import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HomeworkString {

    private final List<String> words;

    public HomeworkString(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public void printUniqueWords(List<String> wordList) {
        Set<String> uniques = new LinkedHashSet<>();
        Set<String> dups = new HashSet<>();
        for (String word : wordList) {
            if (!uniques.add(word)) {
                dups.add(word);
            }
        }
        uniques.removeAll(dups);
        System.out.println(String.join(" ", uniques));
    }
}
