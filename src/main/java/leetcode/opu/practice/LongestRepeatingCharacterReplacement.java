package leetcode.opu.practice;

import java.util.Arrays;

// leetcode 424 longest repeating character replacement
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int res = 0;

        int[] mp = new int[26];
        Arrays.fill(mp, 0);

        while(right < s.length()) {
            mp[s.charAt(right)-'A']++;
            int freq = 0;

            for(int i = 0; i< 26; i++) {
                if(mp[i]> freq) {
                    freq = mp[i];
                }
            }

            while((right - left + 1) - freq > k) {
                mp[s.charAt(left)-'A']--;
                left++;
            }
            res = Math.max(res, right - left +1 );
            right++;
        }
        return res;
    }
}
