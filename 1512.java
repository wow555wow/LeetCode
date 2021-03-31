class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        Map<Integer, Integer> countOfNumbers = new HashMap<Integer, Integer>();
        
        for(int i : nums) {
            if(countOfNumbers.containsKey(i))
            	countOfNumbers.put(i, countOfNumbers.get(i)+1);
            else {
                countOfNumbers.put(i, 1);
            }
        }
        
        int result = 0;
        for(Map.Entry<Integer, Integer> e : countOfNumbers.entrySet()) {
        	int cnt = e.getValue();
        	result += cnt*(cnt-1)/2;
        }
        return result;
    }
}
