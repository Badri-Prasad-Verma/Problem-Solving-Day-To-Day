package app_java_leetcode;

import java.util.HashSet;

public class FindLargestSubString {

	public static void main(String[] args) {
		String str = "pwwkew";
		
		int largest = findLangestString(str);
		System.out.println(largest);
	}

	private static int findLangestString(String str) {
		int count =0;
		int left = 0;
		 HashSet<Character> set = new HashSet<>();
		
		 for (int right = 0; right < str.length(); right++) {
			char character = str.charAt(right);
			
			while(set.contains(character)) {
				set.remove(str.charAt(left));
				left++;
			}
			
			set.add(character);
			
			count = Math.max(count, right - left +1);
		}
		 
		return count;
	}

	
	
}
