class Solution {
    public List<String> cartesian(List<String> s1,List<String> s2){
        List<String> list=new ArrayList<String>();
        for(int i=0;i<s1.size();i++){
            for(int j=0;j<s2.size();j++){
                StringBuilder sb=new StringBuilder();
                sb.append(s1.get(i));
                sb.append(s2.get(j));
                list.add(sb.toString());
            }
        }
        return list;
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<String>();
        HashMap<Character,String[]> hm=new HashMap<>();
        hm.put('2',new String[]{"a","b","c"});
        hm.put('3',new String[]{"d","e","f"});
        hm.put('4',new String[]{"g","h","i"});
        hm.put('5',new String[]{"j","k","l"});
        hm.put('6',new String[]{"m","n","o"});
        hm.put('7',new String[]{"p","q","r","s"});
        hm.put('8',new String[]{"t","u","v"});
        hm.put('9',new String[]{"w","x","y","z"});
        ArrayList<String> result=new ArrayList<>();
        if(digits.length()==1){
            char ch=digits.charAt(0);
            String[] temp=hm.get(ch);
            for(String s:temp){
                result.add(s);
            }
        }
        else{
            List<String> temp=Arrays.asList(hm.get(digits.charAt(0)));
            for (int i=1;i<digits.length();i++){
                temp=cartesian(temp,Arrays.asList(hm.get(digits.charAt(i))));
            }
                result=new ArrayList<String>(temp); 
        }
        return result;
        /*
        For Debugging Purposes, and checking generated HashMap.
        for(int i=2;i<=9;i++){
            char ch=Integer.toString(i).charAt(0);
            String[] temp=hm.get(ch);
            System.out.print(ch+"-> ");
            for(String s:temp){
                if(!temp[temp.length-1].equals(s))
                System.out.print(s+", "); 
                else
                System.out.print(s); 
            }
            System.out.println();
        }
        */
    }
}