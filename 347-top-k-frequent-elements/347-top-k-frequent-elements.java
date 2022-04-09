class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        /*
        ArrayList<Integer> ar=new ArrayList<>();
        
        hm.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(map -> ar.add(map.getKey()));
        int[] result=new int[k];
        int i=0;
        for(int num:ar){
            if(i<k)
            result[i++]=num;
            else
                break;
        }
        return result;
        */
        // Optimised Approach using Heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> hm.get(n1) - hm.get(n2));
        for (int num: hm.keySet()) {
          heap.add(num);
          if (heap.size() > k) heap.poll();    
        }
        int[] result = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            result[i] = heap.poll();
        }
        return result;
    }
}
