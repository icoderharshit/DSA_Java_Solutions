// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [][] = new int[sizeOfArray][2];
		    
		    for(int i = 0;i<sizeOfArray;i++){
    		    line = br.readLine();
    		    String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);
		    }
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.permute(arr, sizeOfArray);
		    for(int i: ans)
		        System.out.println(i);
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute (int arr[][], int n) {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int[] queue:arr){
            int sum=0;
            for(int num:queue){
                sum+=num;
            }
            ar.add(sum);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            result.add(i);
        }
        Collections.sort(result, (i,j)->{
           return ar.get(i-1)-ar.get(j-1); 
        });
        return result;
    }
}


