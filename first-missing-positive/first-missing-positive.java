import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < Integer.MAX_VALUE; i++) {
            int search = Arrays.binarySearch(nums, i);
            if(search < 0) return i;
        }
        
        return -1;
    }
}