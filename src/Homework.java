import java.util.*;

public class Homework {

    private final List<Integer> nums;

    public void printOnlyOddNumbers(List nums) {
        for (Object num : nums) {
            if ((Integer) num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void printOnlyOneCopyEvenNumbers(List nums) {
        Set<Integer> setNumbers = new HashSet<>();
        for (Object num : nums) {
            setNumbers.add((Integer) num);
        }
        List sortedList = new ArrayList(setNumbers);
        Collections.sort(sortedList);
        for (Object num : sortedList) {
            if ((Integer) num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public Homework(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
