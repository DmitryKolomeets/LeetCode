package length_of_last_word;

public class Solution {


    public int lengthOfLastWord(String s) {
        int wordLenght = 0;
        String[] words = s.split(" ");
        if (words.length > 0) {
            wordLenght = words[words.length - 1].length();
        } else {
            wordLenght = 0;
        }
        return wordLenght;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        int answer = solution.lengthOfLastWord("luffy is still joyboy");
        System.out.println(answer);
    }

}
