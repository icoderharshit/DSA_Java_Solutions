class Solution {
    public int largestInteger(int num) {
        /*
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int n:num){
            if(n%2==0)
                even.add(n);
            else
                odd.add(n);
        }
        int a=even.size()-1,b=odd.size()-1;
        int s=Math.min(even.size(),odd.size());
        String s="";
        for(int i=0;i<s;i++){
            if(even.get(a)>odd.get(b))
                
        }
        */
        List<Integer> digits = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        int temp = num;
        
        while (temp != 0) {
            digits.add(temp % 10);
            temp = temp / 10;
        }
        
        Collections.reverse(digits);
        
        for (int i = 0; i < digits.size(); i++) {
            int digit = digits.get(i);
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }
                
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(even);
        Collections.reverse(odd);
        
        int evenIndex = 0;
        int oddIndex = 0;
        int result = 0;
        
        for (int i = 0; i < digits.size(); i++) {
            int digit = digits.get(i);
            
            if (digit % 2 == 0) {
                result = result * 10 + even.get(evenIndex);
                evenIndex++;
            } else {
                result = result * 10 + odd.get(oddIndex);
                oddIndex++;                
            }
        }
        
        return result;
        /*
       even  6 8
        odd  5 5 7
        
        8 7 6 5 5
        */
    }
}