class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num=0;
        for(String s : stones.split("")) {
            if(jewels.contains(s)) num++;
        }
        return num;
    }
}
