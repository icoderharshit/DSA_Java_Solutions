class Solution {
    public void gameOfLife(int[][] board) {
int[][] direction=new int[][]{{-1,-1},{-1,0},{0,-1},{1,0},{0,1},{1,1},{1,-1},{-1,1}};
        int m=board.length,n=board[0].length;
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                for(int[] dir:direction){
                    int x=i+dir[0];
                    int y=j+dir[1];
                    if(x>=0 && x<m && y>=0 && y<n && board[x][y]==1)
                        count++;
                }
                if(board[i][j]==1)
                {
                    if(count==2 || count==3)
                        res[i][j]=1;
                }
                else{
                    if(count==3)
                    res[i][j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=res[i][j];
            }
        }
    }
}