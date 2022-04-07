class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int v : stones){
            maxHeap.offer(v);
        }
        int x;
        int y;
        while(maxHeap.size() > 1){
            y = maxHeap.poll();
            x = maxHeap.poll();
            if(y > x){
                maxHeap.offer(y - x);
            }
        }
        if(maxHeap.size() == 0) return 0;
        return maxHeap.poll();
    }
}