class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())
            return false;
        
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        char[] s2c = s2.toCharArray();
        int s1length = s1.length(); 
        
        for(char s1c : s1.toCharArray())
            s1Array[s1c-'a']++;
        
        for(int i=0; i< s1length-1; i++)
            s2Array[s2c[i]-'a']++;
        
        for(int i = s1length-1; i<s2c.length; i++){
            s2Array[s2c[i]-'a']++;
            if(Arrays.equals(s2Array, s1Array))
                return true;
            s2Array[s2c[i-s1length+1]-'a']--;
        }
        return false;
    }
}