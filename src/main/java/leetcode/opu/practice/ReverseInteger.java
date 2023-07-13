package leetcode.opu.practice;

// #LeetCode 7
public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = x *(-1);
        }

        long num = 0;
        while(x > 0) {
            num = num*10 + (x%10);
            if(num > Integer.MAX_VALUE) {
                return 0;
            }
            x = x/10;
        }
        return isNegative ? (int) (num*-1) : (int) num;
    }
}
