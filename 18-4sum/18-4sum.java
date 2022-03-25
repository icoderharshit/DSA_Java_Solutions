class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        if(nums==null || nums.length==0)
            return result;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=target-(nums[i]+nums[j]);
                int front=j+1;
                int rear=n-1;
                while(front<rear){
                    if(nums[front]+nums[rear]<sum)
                        front++;
                    else if(nums[front]+nums[rear]>sum)
                        rear--;
                    else{
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[rear]);
                        result.add(quad);
                        while(front<rear && nums[front]==quad.get(2)){
                            front++;
                        }
                        while(front<rear && nums[rear]==quad.get(3))
                        {
                            rear--;
                        }
                    }
                }
                while(j+1<n && nums[j+1]==nums[j])
                    j++;
            }
            while(i+1<n && nums[i+1]==nums[i]){
                i++;
            }
        }
        return result;
    }
}