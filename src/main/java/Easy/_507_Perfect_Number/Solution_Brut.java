package Easy._507_Perfect_Number;

public class Solution_Brut {

    public static boolean checkPerfectNumber(int num) {

        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return sum == num;

    }
}
