class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // O(nlogN)
        Arrays.sort(nums);
        
        int maxLength = 1;
        int prevNumber = nums[0];
        int currentSequence = 1;
        int j = 1;
        while(j < nums.length) {
            int i = nums[j];
            if(prevNumber == i) {
                j++;
                continue;
            }
            if(prevNumber + 1 == i) {
                currentSequence++;
                maxLength = Math.max(maxLength, currentSequence);
            } else {
                currentSequence = 1;
                
            }
            prevNumber = i;
            j++;
        }
        
        return maxLength;
    }
}