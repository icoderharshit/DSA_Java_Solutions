class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0,high=numbers.length-1;
        while(low<=high){
          if(numbers[low]+numbers[high]==target)
              break;
          else if(numbers[low]+numbers[high]<target) 
              low++;
          else if(numbers[low]+numbers[high]>target)
              high--;
        }
            return new int[]{low+1,high+1};
    }
}