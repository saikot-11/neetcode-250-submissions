class MyHashMap {
    private ArrayList<ArrayList<Entry>> list;
    private static final int LIST_SIZE = 1000;

    public MyHashMap() {
        list = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(new ArrayList<>());
        }
    }
    
    public void put(int key, int value) {
        int hash = getHash(key);
        ArrayList<Entry> tempList = list.get(hash);

        for (Entry en : tempList) {
            if (en.key == key) {
                en.value = value;
                return;
            }
        }
        
        tempList.add(new Entry(key, value));
        list.set(hash, tempList);
    }
    
    public int get(int key) {
        int hash = getHash(key);
        ArrayList<Entry> tempList = list.get(hash);
        for (Entry en : tempList) {
            if (en.key == key) {
                return en.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int hash = getHash(key);
        ArrayList<Entry> tempList = list.get(hash);
        for (int i = 0; i < tempList.size(); i++) {
            Entry en = tempList.get(i);
            if (en.key == key) {
                tempList.remove(i);
            }
        }
    }

    private int getHash(int key) {
        return key % LIST_SIZE;
    }

    static class Entry {
        public int key;
        public int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */