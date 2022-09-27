import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Homework homework = new Homework(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        homework.printOnlyOddNumbers(homework.getNums());
        homework.printOnlyOneCopyEvenNumbers(homework.getNums());
    }


}