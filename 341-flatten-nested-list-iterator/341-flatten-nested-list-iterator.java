public class NestedIterator implements Iterator<Integer> {
    private LinkedList<Integer> list;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        list = new LinkedList<>();
        for (NestedInteger inp : nestedList) {
            buildRecursive(inp);
        }
        
    }
    
    private void buildRecursive (NestedInteger nested) {
        if (nested.getInteger() == null) {
            for (NestedInteger inp : nested.getList()) {
                buildRecursive(inp);
            }
        } else {
            list.add(nested.getInteger());
        }
    }

    @Override
    public Integer next() {
        return list.removeFirst();
    }

    @Override
    public boolean hasNext() {
        return list.size() != 0;
    }
}