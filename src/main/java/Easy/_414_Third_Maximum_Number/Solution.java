package Easy._414_Third_Maximum_Number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;

public class Solution {

    public static int thirdMax(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int elementCount = 0;
        int prevElement = nums[0];

        for (int index = 1; index < nums.length; ++index) {
            if (nums[index] != prevElement) {
                elementCount += 1;
                prevElement = nums[index];
            }

            if (elementCount == 3) {
                return nums[index];
            }
        }


        return nums[0];

    }

    public static void main(String[] args) {
        int[] array = {2, 6, 7, 4, 234, 456, 55, 34, 67};

        System.out.println(thirdMax(array));

    }


}
