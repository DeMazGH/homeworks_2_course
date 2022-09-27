import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HomeworkInteger numsList = new HomeworkInteger(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        HomeworkString wordList = new HomeworkString(new ArrayList<>(List.of("one", "two", "one", "three", "four", "two")));

        numsList.printOnlyOddNumbers(numsList.getNums());
        numsList.printOnlyOneCopyEvenNumbers(numsList.getNums());
        wordList.printUniqueWords(wordList.getWords());
        wordList.printNumbersOfTakes(wordList.getWords());
    }


}