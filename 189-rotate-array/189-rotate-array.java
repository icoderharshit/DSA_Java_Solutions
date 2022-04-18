class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int low=0,high=nums.length-1;
        while(low<high)
        {
            swap(nums,low++,high--);
        }
        low=0;
        high=k-1;
        while(low<high){
            swap(nums,low++,high--);
        }
        low=k;
        high=nums.length-1;
        while(low<high){
            swap(nums,low++,high--);
        }
        
    }
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}