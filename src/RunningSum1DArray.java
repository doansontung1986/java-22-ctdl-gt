import java.util.Arrays;

public class RunningSum1DArray {

    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        RunningSum1DArray runningSum1DArray = new RunningSum1DArray();
        System.out.println(Arrays.toString(runningSum1DArray.runningSum(nums)));
    }
}
