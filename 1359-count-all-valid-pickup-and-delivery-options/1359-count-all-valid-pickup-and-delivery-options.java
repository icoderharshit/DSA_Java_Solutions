class Solution {
    public int countOrders(int n) {
        long[] dp=new long[n+1];
        dp[0]=1;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=1;i<=n;i++){
            dp[i]=i*dp[i-1]*(2*i-1);
            dp[i]=dp[i]%mod;
        }
        return (int)dp[n];
    }
}