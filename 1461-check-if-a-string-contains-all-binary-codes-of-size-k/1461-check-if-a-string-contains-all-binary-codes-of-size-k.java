class Solution {
    public boolean hasAllCodes(String s, int k) {
        int req=1<<k;
        HashSet<String> checked=new HashSet<String>();
        for (int i=k;i<=s.length();i++) {
            String a=s.substring(i-k,i);
            if (!checked.contains(a)){
                checked.add(a);
                req-=1;
                if(req==0){
                    return true;
                }
            }
        }
        return false;
    }
}