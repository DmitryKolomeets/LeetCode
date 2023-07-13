package Easy._231_Power_Of_Two;

import org.w3c.dom.ls.LSOutput;

public class Solution {

    public static boolean isPowerOfTwo(int n) {



        if(n==0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));

    }
}
