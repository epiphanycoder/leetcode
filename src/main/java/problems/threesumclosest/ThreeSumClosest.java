package problems.threesumclosest;

import java.util.Arrays;

// Leetcode: 16
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(i>0 && nums[i] ==  nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                int s = Math.abs(target-sum);
                if(s < distance) {
                    distance = s;
                    result = sum;
                }

                if(sum < target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return result;
    }
}
