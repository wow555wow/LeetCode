class Solution {
    public int[] runningSum(int[] nums) {
        
        int bf = 0;
        for(int i=0; i<nums.length; i++) {
            nums[i] += bf;
            bf = nums[i];
        }
        
        return nums;
    }
}
