class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        
        int missingCount = 0;
        for(int i = 1; i <= Integer.MAX_VALUE; i++) {
            if(!set.contains(i)) {
                missingCount++;
                if(missingCount == k) {
                    return i;
                }
            }
        }
        return 0;
        
    }
}