package Easy.HighestAltitude;

import java.util.Arrays;

public class Solution {

//    Input: gain = [-5,1,5,0,-7]
//    Output: 1
//    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

    public static int largestAltitude(int[] gain) {

        int[] altitudes = new int[gain.length + 1];

        for (int i = 0; i < gain.length; i++) {
            altitudes[i+1] = gain[i] + altitudes[i];
        }

        System.out.println(Arrays.toString(altitudes));

        int largestAltitude = 0;
        for (int i = 0; i < altitudes.length; i++) {
            if (altitudes[i] > largestAltitude) {
                largestAltitude = altitudes[i];
            }
        }
        return largestAltitude;
    }


    public static void main(String[] args) {

        int gain[] = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));


    }


}
