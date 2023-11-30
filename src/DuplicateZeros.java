import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();//for copy arr

        int ind = 0;

        for (int i = 0; ind < n; i++) {
            arr[ind++] = temp[i];
            if (temp[i] == 0 && ind != n) {
                arr[ind++] = 0;
            }
        }
    }
}
