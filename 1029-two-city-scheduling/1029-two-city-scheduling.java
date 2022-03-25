class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b)->{
           return (a[0]-a[1])-(b[0]-b[1]); 
        });
        int result=0;
        for(int i=0;i<costs.length;i++){
            result+=i<costs.length/2?costs[i][0]:costs[i][1];
        }
        return result;
    }
}