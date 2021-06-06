class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            String numString = "" + num;
            if(numString.length() % 2 == 0) count++;
        }
        return count;
    }
}