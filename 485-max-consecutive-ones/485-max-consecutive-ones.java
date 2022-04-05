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
// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int count=0, max=0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==0){
//                 max = count>max?count:max;
//                 count = 0;
//             }
//             else{
//                 count++;
//             }
//         }
//         return count>max?count:max;
//     }
// }