package problems.greatnessarray;

import java.util.Arrays;
// Leetcode: 2592 ( n log n)
public class GreatnessOfArray {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i < nums.length; i++) {
            if(nums[i]>nums[count]){
                count++;
            }
        }
        return count;
    }
}
