class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1) {
            if(target == nums[0]) {
                return new int[] {0,0};
            }
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right)/2;
        int[] val = new int[] { -1, -1 };
        while(left <= right) {
            if(nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                int leftMid = mid;
                int rightMid = mid;
                while(leftMid > 0) {
                    if(nums[leftMid - 1] == target) {
                        leftMid--;
                    } else {
                        break;
                    }
                }
                
                while(rightMid < nums.length - 1) {
                    if(nums[rightMid + 1] == target) {
                        rightMid++;
                    } else {
                        break;
                    }
                }
                
                return new int[] { leftMid, rightMid};
            }
            mid = (left + right)/2;
        }
        
        return val;
    }
}