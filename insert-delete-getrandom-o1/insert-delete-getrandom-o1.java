import java.lang.Math;

class RandomizedSet {

    HashSet<Integer> set;
    ArrayList<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)) {
          return false;   
        }
        set.add(val);
        list.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)) {
            set.remove(val);    
            list.remove((Integer) val);
            return true;
        }
        
        set.remove(val);
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int size = list.size();
        int index = (int) Math.floor(Math.random() * size);
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */