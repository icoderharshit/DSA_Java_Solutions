public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        /* Using shifting bits to right-the correct method
        int result=0;
        while(n!=0){
            result+=(n & 1);
            n=n>>>1;
        }
        return result;
        */
        // Let's try doing it using an inbuilt method in Integer class i.e. bitCount()
        return Integer.bitCount(n);
    }
}