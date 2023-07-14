package leetcode.opu.practice;

// #2217. Leetcode
public class FindPalindromeWithFixLength {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int n = queries.length;
        long[] answer = new long[n];

        // +1 to avoid odd length
        int halfPalindromeLength = (intLength + 1) / 2;

        long left = (long)Math.pow(10, halfPalindromeLength -1);
        long right = (long)Math.pow(10, halfPalindromeLength) - 1;

        long totalCount = right - left + 1;

        for(int i = 0; i < queries.length; i++) {

            if(queries[i] <= totalCount) {
                String leftHalf = Long.toString(left + queries[i] - 1);
                String rightHalf = new StringBuilder(leftHalf).reverse().toString();
                answer[i] =  Long.parseLong(leftHalf + rightHalf.substring(intLength%2));
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
