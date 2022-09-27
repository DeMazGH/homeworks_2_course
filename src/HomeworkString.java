import java.util.*;

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

    public void printNumbersOfTakes(List<String> wordList) {
        Map<String, Integer> counter = new HashMap<>();
        for (String word : wordList) {
            int newValue = counter.getOrDefault(word, 0) + 1;
            counter.put(word, newValue);
        }
        int count = 0;
        for (int value : counter.values()) {
            if (value > 1) {
                count = count + value;
            }
        }
        System.out.println("Количество дублей - " + count);
    }
}
