class Solution {
    public String largestGoodInteger(String num) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
            {
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<3;j++){
                    sb.append(num.charAt(i));
                }
                result.add(Integer.parseInt(sb.toString()));
                i+=2;
            }    
        }
        if(result.size()==0)
            return "";
        int answer=Collections.max(result);
        if(answer==0)
            return "000";
        return Integer.toString(answer);
    }
}