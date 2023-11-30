public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return expectSum - sum;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(nums));
    }
}
