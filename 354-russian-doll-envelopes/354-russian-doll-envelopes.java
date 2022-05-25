class Solution {
  public int maxEnvelopes(int[][] envelopes) {
     Arrays.sort(envelopes,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
     int n=envelopes.length;
     int [] dp=new int[n+1];
     int maxi=0;
     for(int i=0;i<n;i++){
         int index=binarySearch(dp,0,maxi,envelopes[i][1]);
         dp[index]=envelopes[i][1];
         if(index==maxi){
             maxi++;
         }
     }
    return maxi;
}
public int binarySearch(int [] arr,int start,int end,int target){
    while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid;
        }
    }
    return start;
    }
}