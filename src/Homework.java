import java.util.List;

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

    public Homework(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }
}
