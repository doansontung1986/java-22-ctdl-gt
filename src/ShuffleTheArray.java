import java.util.Arrays;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[(2 * i) + 1] = nums[i + n];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(nums, n)));
    }
}
