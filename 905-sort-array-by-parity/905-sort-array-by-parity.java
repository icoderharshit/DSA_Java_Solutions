class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<=high){
            if(nums[high]%2==0 && nums[low]%2!=0)
            {
                swap(nums,low,high);
                low++;
            }
            else if(nums[high]%2==0 && nums[low]%2==0){
                low++;
            }
            else
            {
                high--;
            }
        }
        return nums;
    }
    private void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}