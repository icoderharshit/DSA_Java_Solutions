class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target)
                row=Math.max(i,row);
        }
        int low=0,high=matrix[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[row][mid]<target)
                low=mid+1;
            else if(matrix[row][mid]>target)
                high=mid-1;
            else
                return true;
        }
        return false;
    }
}