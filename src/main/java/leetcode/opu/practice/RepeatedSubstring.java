package leetcode.opu.practice;

public class RepeatedSubstring {
    //Leetcode 459 : Repeated Substring Pattern
    public boolean repeatedSubstringPattern(String s) {
        String ss = s+s;
        return ss.substring(1, ss.length()-1).contains(s);
    }
}
