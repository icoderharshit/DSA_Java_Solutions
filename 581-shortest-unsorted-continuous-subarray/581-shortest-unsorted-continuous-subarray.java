public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low=nums.length,high=0;
        for (int i=0;i<nums.length-1;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[j]<nums[i]) {
                    high=Math.max(high,j);
                    low=Math.min(low,i);
                }
            }
        }
        return high-low<0?0:high-low+1;
    }
}