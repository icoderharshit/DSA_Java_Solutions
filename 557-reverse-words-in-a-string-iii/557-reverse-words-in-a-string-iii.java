class Solution {
    public String reverseWords(String s) {
        /*
        StringBuilder str=new StringBuilder(s);
        int low=0,high;
        for(int i=0;i<s.length();i++){
            char ch=str.charAt(i);
                if(ch!=' ' && i!=s.length()-1)
                    continue;
                else if(ch==' ' || i==s.length()-1)
                {
                    if(i==s.length()-1)
                        high=i;
                    else
                        high=i-1;
                    while(low<high){
                        char a=str.charAt(low);
                        str.setCharAt(low,str.charAt(high));
                        str.setCharAt(high,a);
                        low++;
                        high--;
                    }
                    low=i+1;
                }
        }
        return str.toString();
        */
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuilder(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}