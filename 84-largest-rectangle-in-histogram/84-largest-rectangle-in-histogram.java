class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int[] rb=new int[heights.length];
        st.push(heights.length-1);
        rb[heights.length-1]=heights.length;
        for(int i=heights.length-2;i>=0;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
                st.pop();
            if(st.isEmpty())
                rb[i]=heights.length;
            else
                rb[i]=st.peek();
            st.push(i);
        }
        
        int[] lb=new int[heights.length];
        st=new Stack<>();
        st.push(0);
        lb[0]=-1;
        for(int i=1;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty())
                lb[i]=-1;
            else
                lb[i]=st.peek();
            st.push(i);
        }
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int width=rb[i]-lb[i]-1;
            int area=width*heights[i];
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}