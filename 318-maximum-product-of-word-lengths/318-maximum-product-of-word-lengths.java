class Solution {
    public int maxProduct(String[] words) {
        ArrayList<HashSet<Character>>sets=new ArrayList<HashSet<Character>>();
        for(int i=0;i<words.length;i++){
            HashSet<Character>set=new HashSet<>();
            sets.add(set);
            for(char c:words[i].toCharArray()){
                set.add(c);
            }
        }
        int res=0;
        for(int i=0;i<sets.size()-1;i++){
            Set<Character>first=sets.get(i);
            for(int j=i+1;j<sets.size();j++){
                Set<Character>second=sets.get(j);
                boolean flag=true;
                for(char key:first){
                    if(second.contains(key)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    res=Math.max(res,words[i].length()*words[j].length());
                }
            }
        }
        return res;
    }
}