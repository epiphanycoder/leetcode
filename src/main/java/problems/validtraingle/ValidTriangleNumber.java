package problems.validtraingle;

import java.util.Arrays;

public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);

        for(int i = nums.length-1; i>=2; i--){
            int first = 0;
            int second = i-1;

            if(nums[first] + nums[second] > nums[i]){
                result += (second-first);
                second--;
            }else {
                first++;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        ValidTriangleNumber obj = new ValidTriangleNumber();
        System.out.println(obj.triangleNumber(new int[]{2,2,3,4}));
        System.out.println(obj.triangleNumber(new int[]{4,2,3,4}));
    }
}
