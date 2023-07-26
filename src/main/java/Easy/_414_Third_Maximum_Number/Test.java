package Easy._414_Third_Maximum_Number;

import java.util.Arrays;

public class Test {

    static void bubleSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] myArray = {89, 756, 3, 2, 0, 45, 11, 5, 30};

        bubleSort(myArray);
        System.out.println(Arrays.toString(myArray));

    }
}
