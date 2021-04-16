class Solution {
    
    //성능 나쁨, 메모리 보통
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(i==j) continue;
                
                if(nums[i] > nums[j])
                    result[i]++;
            }
        }
        return result;
    }
    
    //성능 중하, 메모리 하
    public int[] smallerNumbersThanCurrent_2(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if(i==j) continue;
                
                if(nums[i] > nums[j]) {
                    result[i]++;
                }else if(nums[i] < nums[j]) {
                    result[j]++;
                }
            }
        }
        return result;
        //한번 할 때 대소비교해서 그 자리에 넣기?
    }
}
