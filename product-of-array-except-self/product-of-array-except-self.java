class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int leftProductSum = 1;
        int rightProductSum = 1;
        leftProduct[0] = 1;
        rightProduct[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftProduct[i] = nums[i-1] * leftProductSum;
            leftProductSum = leftProduct[i];
        }

        for(int j = nums.length - 2; j >= 0; j--) {
            rightProduct[j] = nums[j+1] * rightProductSum;
            rightProductSum = rightProduct[j];
        }

        for(int k = 0; k < nums.length; k++) {
            nums[k] = leftProduct[k] * rightProduct[k];
        }

        return nums;
    }
}