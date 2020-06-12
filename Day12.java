class RandomizedSet {
    HashMap<Integer, Integer> mp;
    ArrayList<Integer> al;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        mp = new HashMap<Integer, Integer>();
        al = new ArrayList<Integer>();
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        
        al.add(val);
        mp.put(val, al.size()-1);
        
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!mp.containsKey(val)) return false;
        
        int p = mp.get(val);
        al.set(p, al.get(al.size()-1));
        mp.put(al.get(p), p);
        al.remove(al.size()-1);
        mp.remove(val);
        
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return al.get((int)(Math.random()*al.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
 /*
 Technique    : Data structure designing
 Useful link  : https://www.youtube.com/watch?v=hT43xpai5s0
 */
