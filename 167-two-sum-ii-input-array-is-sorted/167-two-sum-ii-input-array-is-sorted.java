class Solution {
public int[] twoSum(int[] nums, int target) {
    int high=nums.length-1;
    for(int i=0;i<nums.length;i++){
    int low=i+1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(target-nums[i]==nums[mid] && i!=mid){
        return new int []{i+1,mid+1};
        }
        else if(target-nums[i]>nums[mid])
            low=mid+1;
        else 
            high=mid-1;
        }
    }
        return new int []{-1,-1};
   }
}