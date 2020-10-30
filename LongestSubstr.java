package leetCode.medium;

public class LongestSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(lengthOfLongestSubstring("abcabcbb"));
//		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("dvdf"));

	}
	
	
	/**
	 * �ߺ��Ǵ� ���ڰ� ���� �ִ������ substring�� ���̸� ���϶�
	 * ���� 1) subSquence�� �ȵ�. substring�� ��(���ӵǴ� ���ڿ�)
	 *  replaceAll() ������ ���ָ� �߰����� ������� subsequence�� �ȴ�.
	 * 
	 * ? �������� ������ ����� �ϴ°ɱ�? �� ���°� ������? �̷��ٺ��� ������ ������ ���� ������ ���µ�
	 * 
	 * 
	 * 1. index�� �����ϸ鼭 substring�Ѵ�. (0���� ����)
	 * 2. substr.contains(s.charAt(idx+1)) �� ��� 
	 *  2.1. substr.length�� max�� ��� substr �ʱ�ȭ
	 *  2.2. index+1 ���� �ٽ� substring �ϸ鼭 �� ���� �ݺ� (��ͷ� �����ұ�? �ƴԱ׳� for��?)
	 *   �� subStr.indexOf(s.charAt(idx)) �� idx���� beginIdx�� �ؾ� �Ѵ�.
	 *    �� �ٵ� �� beginIdx�� ���� beginIdx ���Ŀ� �ִ�..
	 * 
	 * @param s : ���ڿ�
	 * @return : �ߺ����� �ʴ� ���ڷ� �̷���� ���� �� ���ڿ��� ����
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
			subStr = s.substring(beginIndex, ++endIndex);	//���� �˸��� ��ġ�� �𸣰���
		}
        
		return maxLen >= subStr.length() ? maxLen : subStr.length();
    }

}
