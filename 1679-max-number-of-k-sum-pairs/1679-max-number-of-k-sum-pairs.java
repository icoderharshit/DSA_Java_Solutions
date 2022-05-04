class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0,high=nums.length-1,count=0;
        while(low<high){
            if(nums[low]+nums[high]<k)
            {
                low++;
            }
            else if(nums[low]+nums[high]>k)
            {
                high--;
            }
            else{
                count++;
                low++;
                high--;
                // ar.remove()
            }
            
        }
        return count;
    }
}