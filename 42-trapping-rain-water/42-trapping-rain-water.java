class Solution {
    public int trap(int[] height) {
        if (height.length==0) 
            return 0; 
        int left = 0, right = height.length-1; 
        int leftMax=0, rightMax=0; 
        int result = 0; 
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left]; 
            if (height[right] > rightMax) rightMax = height[right];
            if (leftMax < rightMax) {
                result += Math.max(0, leftMax-height[left]); 
                left++; 
            } else {
                result += Math.max(0, rightMax-height[right]); 
                right--; 
            }
        }
        return result; 
    }
}