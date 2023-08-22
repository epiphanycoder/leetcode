package leetcode.opu.practice;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int num: nums) {
            totalSum += num;
        }

        if(totalSum % 2 !=0) {
            return false;
        }

        int target = totalSum/2;
        Boolean [][]dp = new Boolean[nums.length][target+1];
        return dfs(nums, nums.length-1,target, dp);
    }

    boolean dfs(int[] nums, int len, int target, Boolean[][] dp) {
        if(target == 0) {
            return true;
        }
        if(len == 0 || target < 0) {
            return false;
        }
        if(dp[len][target] != null) {
            return dp[len][target];
        }
        return  dp[len][target] = dfs(nums, len-1, target - nums[len-1],dp) || dfs(nums, len-1, target,dp);
    }
}
