class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE,count=0;
        for(int num:nums){
            if(num==1 && count==0)
            {
                count++;
            }
            else if(num==1)
            {
                count++;
            }
            else if(num==0)
            {
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}