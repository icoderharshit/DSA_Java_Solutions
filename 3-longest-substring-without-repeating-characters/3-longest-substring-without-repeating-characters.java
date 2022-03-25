class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        // acquire-release principle
        int i=-1,j=-1,result=0,max=Integer.MIN_VALUE;
      while(true){
         boolean flag1=false,flag2=false;
         while(i<s.length()-1){
            flag1=true;
            i++;
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            result=i-j;
            if(hm.get(ch)>1)
                break;
            else
               max=Math.max(result,max);
        }
        while(j<i){
            flag2=true;
            j++;
            char ch=s.charAt(j);
            hm.put(ch,hm.get(ch)-1);
            if(hm.get(ch)==1)
                break;
        }
        if(flag1==false && flag2==false)
           break;   
        }
        return max>0?max:0;
    }
}