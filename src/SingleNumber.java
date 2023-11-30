public class SingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }
}
