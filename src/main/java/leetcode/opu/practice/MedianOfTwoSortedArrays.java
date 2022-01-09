package leetcode.opu.practice;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int low = 0;
        int high = nums1.length;
        int combinedLength = nums1.length + nums2.length;

        while (low <= high) {
            int partX = low + (high - low) / 2;
            ;
            int partY = (combinedLength + 1) / 2 - partX;

            int leftX = partX == 0 ? Integer.MIN_VALUE : nums1[partX - 1]; //getMax(partX, nums1);
            int rightX = (partX == nums1.length) ? Integer.MAX_VALUE : nums1[partX]; // getMin(partX, nums1);

            int leftY = partY == 0 ? Integer.MIN_VALUE : nums2[partY - 1]; // getMax(partY, nums2);
            int rightY = (partY == nums2.length) ? Integer.MAX_VALUE : nums2[partY]; // getMin(partY, nums2);

            if (leftX <= rightY && leftY <= rightX) {
                if (combinedLength % 2 == 0) {
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                } else {
                    return Math.max(leftX, leftY);
                }
            }

            if (leftX > rightY) {
                high = partX - 1;
            } else {
                low = partX + 1;
            }
        }
        return -1;
    }

    private int getMax(int partition, int[] nums) {
        if (partition == 0) {
            return (int) Double.NEGATIVE_INFINITY;
        } else {
            return nums[partition - 1];
        }
    }

    private int getMin(int partition, int[] nums) {
        if (partition == nums.length) {
            return (int) Double.POSITIVE_INFINITY;
        } else {
            return nums[partition];
        }
    }
}
