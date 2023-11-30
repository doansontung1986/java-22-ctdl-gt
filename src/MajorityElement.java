import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 5, 6, 6, 6, 6};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));
    }
}
