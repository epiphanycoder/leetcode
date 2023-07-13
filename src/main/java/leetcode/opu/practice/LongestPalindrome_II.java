package leetcode.opu.practice;

public class LongestPalindrome_II {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <=1) {
            return "";
        }

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {
            int len1 = expandFromMid(i, i, s);
            int len2 = expandFromMid(i,i+1,s);

            int len = Math.max(len1, len2);
            if(end - start < len) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }

    int expandFromMid(int left, int right, String s) {
        if(s == null || left > right) {
            return 0;
        }

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        return right - left - 1;
    }
}
