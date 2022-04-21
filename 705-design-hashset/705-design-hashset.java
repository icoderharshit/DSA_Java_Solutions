class MyHashSet {
    ArrayList<Integer> ar;
    public MyHashSet() {
        ar=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
            ar.add(key);
    }
    
    public void remove(int key) {
        if(contains(key))
            ar.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        for(int num:ar){
            if(num==key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */