public class NestedIterator implements Iterator<Integer> {
    List<Integer> ans = new ArrayList<>();
    int i = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        flat(nestedList);
    }

    @Override
    public Integer next() {
        return ans.get(i++);
    }

    @Override
    public boolean hasNext() {
        return i < ans.size();
    }

    private void flat(List<NestedInteger> list) {
        for (NestedInteger x : list) {
            if (x.isInteger()) {
                ans.add(x.getInteger());
            } else {
                flat(x.getList());
            }
        }
    }
}