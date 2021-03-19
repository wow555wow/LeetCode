class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] shuffled = new int[nums.length];
        
        int j= n, idx=0;
        for(int i=0; i<n;) {
            shuffled[idx++] = nums[i++];
            shuffled[idx++] = nums[j++];
        }
        return shuffled;
    }
}
