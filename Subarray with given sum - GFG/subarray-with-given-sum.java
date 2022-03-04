// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ar=new ArrayList<>();
        int left=0,right=0,curr_sum=arr[0];
        try{
        while(left<n){
            if((curr_sum<s) && (right<n))
            {
                right++;
                curr_sum+=arr[right];
				if(curr_sum > s) {
					curr_sum = curr_sum - arr[left];
					left++;
				}	
            }
            else if(curr_sum>s)
            {
                curr_sum-=arr[left];
                left++;
            }
            else if(curr_sum==s){
                ar.add(left+1);
                ar.add(right+1);
                return ar;
            }
        }
    }
    catch(Exception e){
        ar.add(-1);
        return ar;
    }
        ar.add(-1);
        return ar;
    }
}

