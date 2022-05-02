class Solution {
    public int[] countBits(int n) {
        /*
        int[] result=new int[n+1];
        for(int i=0;i<=n;i++){
            result[i]=countOnes(i);
        }
        return result;
    }
    private int countOnes(int num){
        String bin=Integer.toBinaryString(num);
        int count=0;
        for(char ch:bin.toCharArray()){
            if(ch=='1')
                count++;
        }
        return count;
    }
    */
        // Optimised Approach, O(n)
        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++)
            //result[i] = result[i/2] + i % 2;
        result[i]=Integer.bitCount(i);
            return result;
    }
}