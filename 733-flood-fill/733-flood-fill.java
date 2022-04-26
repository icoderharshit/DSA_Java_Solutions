class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color=image[sr][sc];
        if(color!=newColor)
        {
            helper(image,sr,sc,color,newColor);
        }
        return image;
    }
    public void helper(int[][] image,int sr,int sc,int color,int newColor){
        if(image[sr][sc]==color){
            image[sr][sc]=newColor;
            if(sr>0)
            helper(image,sr-1,sc,color,newColor);
            if(sc>0)
            helper(image,sr,sc-1,color,newColor);
            if(sr+1<image.length)
            helper(image,sr+1,sc,color,newColor);
            if(sc+1<image[0].length)
            helper(image,sr,sc+1,color,newColor);
        }
    }
}
/*
Four directions
sr-1,sc
sr,sc-1
sr+1,sc
sr,sc+1
*/