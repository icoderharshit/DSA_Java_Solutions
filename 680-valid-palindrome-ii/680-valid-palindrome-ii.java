class Solution {
    public boolean check(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
                return true;
    }
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return (check(s,i,j-1) || check(s,i+1,j));
            }
            i++;
            j--;
        }
        return true;
    }
}