class MyHashMap {
    public List<Integer> keys;
    public List<Integer> values;

    public MyHashMap() {
        this.keys = new ArrayList<Integer>();
        this.values = new ArrayList<Integer>();
    }
    
    public void put(int key, int value) {
        if (keys.contains(key)) {
            int pos = keys.indexOf(key);
            values.set(pos,value);
        } else {
            keys.add(key);
            values.add(value);
            //values.set(keys.indexOf(key),value);
        }

    }
    
    public int get(int key) {
        if (keys.contains(key)) {
            return values.get(keys.indexOf(key));
        } else {
            return -1;
        }
    }
    
    public void remove(int key) {
        if (keys.contains(key)) {
            values.remove(keys.indexOf(key));
            keys.remove(keys.indexOf(key));
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
