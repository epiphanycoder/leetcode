package leetcode.opu.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> _set = new HashSet();
        int ans = Integer.MIN_VALUE;

        if(s.length() < 2) {
            return s.length();
        }

        for(int i = 0, j = 0; i < s.length(); i++) {
            while(_set.contains(s.charAt(i))) {
                _set.remove(s.charAt(j));
                j++;
            }

            _set.add(s.charAt(i));
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
