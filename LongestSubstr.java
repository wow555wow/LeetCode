package leetCode.medium;

public class LongestSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(lengthOfLongestSubstring("abcabcbb"));
//		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("dvdf"));

	}
	
	
	/**
	 * 중복되는 문자가 없는 최대길이의 substring의 길이를 구하라
	 * 주의 1) subSquence는 안됨. substring만 됨(연속되는 문자열)
	 *  replaceAll() 등으로 없애면 중간값이 사라져서 subsequence가 된다.
	 * 
	 * ? 방어로직을 어디까지 해줘야 하는걸까? 다 막는게 좋은가? 이러다보면 꼬리에 꼬리를 물고 과부하 오는디
	 * 
	 * 
	 * 1. index를 증가하면서 substring한다. (0부터 시작)
	 * 2. substr.contains(s.charAt(idx+1)) 인 경우 
	 *  2.1. substr.length를 max에 담고 substr 초기화
	 *  2.2. index+1 부터 다시 substring 하면서 위 과정 반복 (재귀로 가능할까? 아님그냥 for문?)
	 *   ㄴ subStr.indexOf(s.charAt(idx)) 의 idx값을 beginIdx로 해야 한다.
	 *    ㄴ 근데 그 beginIdx가 현재 beginIdx 이후에 있는..
	 * 
	 * @param s : 문자열
	 * @return : 중복되지 않는 문자로 이루어진 가장 긴 문자열의 길이
	 */
	public static int lengthOfLongestSubstring(String s) {
        
		int maxLen = 0;
		int beginIndex=0;
		String subStr = "";
		for(int endIndex=0; endIndex<s.length();) {
			
//			System.out.println("[" + subStr + "], [" + s.charAt(endIndex) + "], ["+subStr.length() + "], [" + endIndex + "] max[" + maxLen + "]");
			if(-1 < subStr.indexOf(s.charAt(endIndex))) {
//				System.out.println(subStr.indexOf(s.charAt(endIndex)));
				if(maxLen < subStr.length()) maxLen = subStr.length();
//				subStr = "";
				beginIndex = s.indexOf(s.charAt(endIndex), beginIndex)+1;
//				System.out.println("beginIdx[" + beginIndex + "]");
//				continue;
			}
			subStr = s.substring(beginIndex, ++endIndex);	//얘의 알맞은 위치를 모르겠음
		}
        
		return maxLen >= subStr.length() ? maxLen : subStr.length();
    }

}
