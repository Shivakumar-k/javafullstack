package com.Number;


/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0

*/
public class Demo {
	public static void main(String[] args) {
		 countYZ("hiy hiz");

		countYZ("ahiy xhiz");
//		countYZ("ahibhi");
//		countYZ("xhixhi");
	}

	private static void countYZ(String str) {
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean check = Character.isLetter(ch);
			// System.out.println(ch+" "+check);

			if (!check) {
				if ((str.charAt(i - 1) == 'y') || (str.charAt(i - 1) == 'z')) {
					count++;
				}
			} else {
				continue;
			}
			if (str.substring(str.length() - 1).equals("y") || str.substring(str.length() - 1).equals("z")) {
				count1++;
			}
//			if((str.charAt(str.length()-1)=='y')||(str.charAt(str.length()-1)=='z')) {
//				count1++;
//			}

		}
		System.out.println(count + count1);

	}
}
