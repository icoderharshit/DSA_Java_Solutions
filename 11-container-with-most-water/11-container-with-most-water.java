class Solution {
    public int maxArea(int[] height) {
         int low=0,high=height.length-1,result=Integer.MIN_VALUE;
          while(low<high)
          {
              int h=Math.min(height[low],height[high]);
              int w=high-low;
              result=Math.max(result,h*w);
              if(height[low]<height[high])
                  low++;
              else
                  high--;
          }
        return result;
    }
}