class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        //아이들이 가진 사탕의 수 중 최댓값을 구한다
        int max = 0;
        for(int i:candies) {
            max = Math.max(max, i);
        }
        
        //최댓값과 아이가 가진 사탕+여분사탕을 비교
        List<Boolean> result = new ArrayList<>();
        for(int i:candies) {
            if(max <= i+extraCandies)
                result.add(true);
            else result.add(false);
        }
        
        return result;
    }
}
