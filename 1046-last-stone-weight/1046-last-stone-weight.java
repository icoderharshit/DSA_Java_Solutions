class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        
        for(int i = stones.length - 1; i > 0; i--){
            stones[i - 1] = stones[i] - stones[i - 1];
            Arrays.sort(stones);
        }
        return stones[0];
    }
}