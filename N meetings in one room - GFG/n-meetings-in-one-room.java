// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    static class pair
    {
        int s , e;
        pair(int s,int e)
        {
            this.s = s;
            this.e = e;
        }
    }
   public static int maxMeetings(int start[],int end[],int n)
    {
        ArrayList<pair> ar = new ArrayList<>();
        for(int i = 0; i < n; i++)
            ar.add(new pair(start[i] , end[i]));
        
        Collections.sort(ar,(a,b)->(a.e-b.e));
        
        int count = 1;
        int prev = 0;
        for(int i = 1; i < n; i++)
        {
            if(ar.get(i).s>ar.get(prev).e)
            {
                prev = i;
                count++;
            }
        }
        return count;
    }
}
