class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int result=1,max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==nums[i-1]+1)
                    result+=1;
                else{
                max=Math.max(max,result);
                result=1;
                }
            }
        }
        return Math.max(max,result);
    }
}