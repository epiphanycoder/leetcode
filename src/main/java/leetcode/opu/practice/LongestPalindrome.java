package leetcode.opu.practice;

//5. Longest Palindromic Substring
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int resLen = 0;
        String resContent = "";

        for (int i = 0; i < s.length(); i++) {

            //Odd length
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > resLen) {
                    resContent = s.substring(left, right + 1);
                    resLen = right - left + 1;
                }
                left--;
                right++;
            }

            //Even length
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > resLen) {
                    resContent = s.substring(left, right + 1);
                    resLen = right - left + 1;
                }
                left--;
                right++;
            }
        }

        System.out.println(resContent);
        return resContent;
    }
}
