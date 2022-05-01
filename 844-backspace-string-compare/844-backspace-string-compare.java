class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=new StringBuilder(t);
        while(s1.toString().contains("#") && s1.lastIndexOf("#")!=0){
            for(int i=1;i<s1.length();i++){
                if(s1.charAt(i)=='#')
                {
                    s1.deleteCharAt(i);
                    s1.deleteCharAt(i-1);
                    break;
                }
            }
        }
        while(s2.toString().contains("#") && s2.lastIndexOf("#")!=0){
            for(int i=1;i<s2.length();i++){
                if(s2.charAt(i)=='#')
                {
                    s2.deleteCharAt(i);
                    s2.deleteCharAt(i-1);
                    break;
                }
            }
        }
        if(s1.toString().contains("#")){
            s1.deleteCharAt(0);
        }
        if(s2.toString().contains("#")){
            s2.deleteCharAt(0);
        }
        System.out.print(s1.toString()+" "+s2.toString());
        if(s1.toString().equals(s2.toString()))
            return true;
        return false;
    }
}