class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited=new boolean[nums.length];
        for(int num:nums){
            if(visited[num])
                return num;
            visited[num]=true;
        }
        return -1;
    }
}