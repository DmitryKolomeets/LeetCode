package Easy._387_First_Unique_Character_in_a_String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];
        char[] letters = s.toCharArray();

        for (char c : letters) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < letters.length; i++) {
            if (freq[letters[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }


}


}
