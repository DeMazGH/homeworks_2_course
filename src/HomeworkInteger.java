import java.util.*;

public class HomeworkInteger {

    private final List<Integer> nums;

    public void printOnlyOddNumbers(List<Integer> numsList) {
        for (Integer num : numsList) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void printOnlyOneCopyEvenNumbers(List<Integer> numsList) {
        Set<Integer> setNumbers = new HashSet<>(numsList);
        List<Integer> sortedList = new ArrayList<>(setNumbers);
        Collections.sort(sortedList);
        for (Integer num : sortedList) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public HomeworkInteger(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
