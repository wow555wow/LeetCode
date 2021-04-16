class Solution {
    public int arraySign(int[] nums) {
        
        int rst = 1;
        for(int i : nums) {
            if(i==0) return 0;
            else if(i<0) rst *= -1;
        }
        
        return rst; 
    }
}
