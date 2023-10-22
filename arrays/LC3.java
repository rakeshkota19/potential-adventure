package arrays;

import java.util.HashMap;
import java.util.Map;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length(), ans = 0, left = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0 ; i < len ; i++) {
            Character c = s.charAt(i);

            if (charMap.containsKey(c) && charMap.get(c) >= left) {
                ans = Math.max(ans, i - left);
                left = charMap.get(c) + 1;
            }

            charMap.put(c, i);
        }

        ans = Math.max(ans, len - left);
        return ans;
    }
}
