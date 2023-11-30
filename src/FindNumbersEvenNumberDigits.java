public class FindNumbersEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int number : nums) {
            if (checkEvenDigits(number)) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        FindNumbersEvenNumberDigits findNumbersEvenNumberDigits = new FindNumbersEvenNumberDigits();
        System.out.println(findNumbersEvenNumberDigits.findNumbers(nums));
    }

    private boolean checkEvenDigits(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count % 2 == 0;
    }
}
