class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int count=1;
        for(int layer=0;layer<(n+1)/2;layer++){
            for(int i=layer;i<n-layer;i++){
                result[layer][i]=count++;
            }
            for(int i=layer+1;i<n-layer;i++){
                result[i][n-layer-1]=count++;
            }
            for(int i=layer+1;i<n-layer;i++){
                result[n-layer-1][n-i-1]=count++;
            }
            for(int i=layer+1;i<n-layer-1;i++){
                result[n-i-1][layer]=count++;
            }
        }
        return result;
    }
}