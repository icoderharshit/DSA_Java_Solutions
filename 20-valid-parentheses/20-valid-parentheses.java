class Solution {
    public boolean isValid(String s) {
      Stack<Character> st=new Stack<>();
       for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else{
                if(!st.isEmpty())
                {
                    char temp=st.pop();
                    switch(temp){
                        case '(':
                        if(ch!=')')
                            return false;
                        break;
                        case '{':
                        if(ch!='}')
                            return false;
                        break;   
                        case '[':
                        if(ch!=']')
                            return false;
                        break;
                    }
                }
                else{
                    return false;
                }
            }
       }
        if(!st.isEmpty())
            return false;
        return true;
    }
}