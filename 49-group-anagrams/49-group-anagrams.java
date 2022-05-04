class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        List<List<String>> result=new ArrayList<>();
        List<String> container=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> list=new ArrayList<>();        
            list.add(strs[i]);
            char[] str=strs[i].toCharArray();
            Arrays.sort(str);
            String check="";
            for(char ch:str){
                check+=Character.toString(ch);
            }
            if(!container.contains(check))
                container.add(check);
            else
                continue;
            for(int j=0;j<strs.length;j++){
                String s1=strs[i];
                String s2=strs[j];
                char[] s1c=s1.toCharArray();
                char[] s2c=s2.toCharArray();
                Arrays.sort(s1c);
                Arrays.sort(s2c);
                if(i!=j && Arrays.equals(s1c,s2c))
                  list.add(s2);
            }
            result.add(list);
        }
        return result;
        */
		int n = strs.length;
		HashMap<String,ArrayList<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++){
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			String t = new String(tmp);

			if(map.containsKey(t)){
				ArrayList<String> list = map.get(t);
				list.add(strs[i]);
				map.put(t,list);
			}else{
				ArrayList<String> list = new ArrayList<>();
				list.add(strs[i]);
				map.put(t,list);
			}

		}

		return new ArrayList(map.values());
    }
}