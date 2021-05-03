class Solution {
    public int majorityElement(int[] nums) {
        int majorityNumber = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > majorityNumber) return i;
        }
        
        return -1;
    }
}