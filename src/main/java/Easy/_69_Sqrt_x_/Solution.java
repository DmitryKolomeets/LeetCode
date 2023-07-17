package Easy._69_Sqrt_x_;

public class Solution {

    public static int mySqrt(int x) {

        if(x==0 || x==1) {
            return x;
        }

            int i =1;
            int result = 1;

            while (result <= x) {
                i++;
                result = i * i;
            }
        return i-1;

    }


    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

}
