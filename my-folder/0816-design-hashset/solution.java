class MyHashSet {
    public ArrayList<Integer> keys;

    public MyHashSet() {
        keys = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if (!keys.contains(key))
            keys.add(key);
    }
    
    public void remove(int key) {
        if (keys.contains(key))
            keys.remove(keys.indexOf(key));
    }
    
    public boolean contains(int key) {
        if (keys.contains(key))
            return true;
        else
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
