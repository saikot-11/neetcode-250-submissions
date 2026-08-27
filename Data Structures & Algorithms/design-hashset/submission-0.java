class MyHashSet {

    private LinkedList<LinkedList<Integer>> list;
    private static final int HASH_NUMBER = 1000;

    public MyHashSet() {
        list = new LinkedList<>();

        for (int i = 0; i <= HASH_NUMBER; i++) {
            LinkedList<Integer> tempList = new LinkedList<>();
            list.add(tempList);
        }
    }
    
    public void add(int key) {
        int hash = key % HASH_NUMBER;
        LinkedList<Integer> tempList = list.get(hash);
        if (!contains(key)) {
            tempList.add(key);
            list.set(hash, tempList);
        }
    }
    
    public void remove(int key) {
        int hash = key % HASH_NUMBER;
        LinkedList<Integer> tempList = list.get(hash);
        if (contains(key)) {
            for (int i = 0; i < tempList.size(); i++) {
                if (tempList.get(i) == key) {
                    tempList.remove(i);
                }
            }
            list.set(hash, tempList);
        }
    }
    
    public boolean contains(int key) {
        int hash = key % HASH_NUMBER;
        LinkedList<Integer> tempList = list.get(hash);
        for (Integer in : tempList) {
            if (in == key) {
                return true;
            }
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