class Solution {
    public int longestConsecutive(int[] nums) {
        //Optimised Approach, O(n) & space-complexity O(n) using HashSet
       Set<Integer> hs=new HashSet<>();
       for(int num:nums){
           hs.add(num);
       }
       int max=Integer.MIN_VALUE;
       for(int num:hs){
           if(!hs.contains(num-1))
           {
               int currentNum=num;
               int result=1;
               while(hs.contains(currentNum+1)){
                   currentNum+=1;
                   result+=1;
               }
               max=Math.max(max,result);
           }
       }
        return max>0?max:0;
        /* O(n*log(n))
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
        */
    }
}