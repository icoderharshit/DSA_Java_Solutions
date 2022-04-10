class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> ar=new ArrayList<>();
        int j=0;
        for(int i=0;i<ops.length;i++){
            String s=ops[i];
            if(s.equals("+"))
            {
                ar.add(ar.get(j-1)+ar.get(j-2));
                j++;
            }
            else if(s.equals("D"))
            {
                ar.add(ar.get(j-1)*2);
                j++;
            }
            else if(s.equals("C"))
            {
                j--;
                ar.remove(j);
            }
            else
            {
                ar.add(Integer.parseInt(s));
                j++;
            }
        }
        int result=0;
        for(int num:ar){
            result+=num;
        }
        return result;
    }
}