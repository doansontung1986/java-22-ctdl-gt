import java.util.Arrays;

public class BuildArrayPermutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        BuildArrayPermutation buildArrayPermutation = new BuildArrayPermutation();
        System.out.println(Arrays.toString(buildArrayPermutation.buildArray(nums)));
    }
}
