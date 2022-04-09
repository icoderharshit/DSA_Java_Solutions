class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
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
    }
}