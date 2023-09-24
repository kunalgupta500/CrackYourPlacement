class MyHashMap {
HashMap<Integer, Integer> map=new HashMap<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        
            map.put(key, value);
       
    }
    
    public int get(int key) {
       if(map.containsKey(key))
       {
        return map.get(key);
       }
       else
       {
           return -1;
       }
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}
