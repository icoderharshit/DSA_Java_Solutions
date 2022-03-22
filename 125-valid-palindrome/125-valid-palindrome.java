class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        // System.out.println(s);
        // System.out.println(sb.toString());
        if(s.equals(sb.toString()))
            return true;
        return false;
    }
}