class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> ar;
    int i;
    public StockSpanner() {
        st=new Stack<>();
        ar=new ArrayList<>();
        i=0;
    }
    
    public int next(int price) {
        int c=0;
        ar.add(price);
        while(!st.isEmpty() && ar.get(st.peek())<=price){
            st.pop();
        }
        if(st.isEmpty())
            c=i+1;
        else
            c=i-st.peek();
        st.push(i++);
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
