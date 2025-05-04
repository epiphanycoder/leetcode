package problems.threesumsmaller;

import java.util.Arrays;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;

        for(int i = 0;i < nums.length; i++){
            int j = i+1;
            int k =  nums.length -1;

            while(j < k){
                if(nums[i]+nums[j] < (target - nums[k])){
                    count += (k-j);
                    j++;
                }else {
                    k--;
                }
            }
        }
        return count;
    }
}
