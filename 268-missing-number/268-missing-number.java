class Solution {
    public int missingNumber(int[] nums) {
        int originalSum=((nums.length)*(nums.length+1))/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return originalSum-sum;
    }
}