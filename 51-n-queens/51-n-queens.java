class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> boards=new ArrayList<>();
        ArrayList<String> asf=new ArrayList<>();
        
        placeQueens(0,n,asf,boards);
        
        return boards;
    }
    public void placeQueens(int row,int n,ArrayList<String> asf,List<List<String>> boards){
        if(row==n){
            boards.add(new ArrayList<>(asf));
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(row,i,asf)){
                StringBuilder ns=new StringBuilder();
                for(int j=0;j<i;j++){
                    ns.append(".");
                }
                ns.append("Q");
                for(int j=i+1;j<n;j++){
                    ns.append(".");
                }
                asf.add(ns.toString());
                placeQueens(row+1,n,asf,boards);
                asf.remove(asf.size()-1);
            }
        }
    }
    public boolean isSafe(int row,int col,ArrayList<String> board){
        for(int i=0;i<board.size();i++){
            if(board.get(i).charAt(col)=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.get(0).length();i--,j++){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }
}