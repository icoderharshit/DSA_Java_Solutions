class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] temp=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0)
                    break;
                count++;
            }
            temp[i]=count*1000+i;
        }
        Arrays.sort(temp);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=temp[i]%1000;
        }
        return result;
    }
}