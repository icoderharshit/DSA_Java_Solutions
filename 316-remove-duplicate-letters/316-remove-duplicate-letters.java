class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] visited=new boolean[26];
        int[] lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
              int curr=s.charAt(i)-'a';
            if(visited[curr])
                continue;
            while(!st.isEmpty() && curr<st.peek() && i<lastIndex[st.peek()]){
                visited[st.pop()]=false;
            }
            visited[curr]=true;
            st.push(curr);
        }
        StringBuilder sb=new StringBuilder();    
        for(Integer i:st){
            sb.append((char)(i+'a'));
        }
        return sb.toString();
    }
}