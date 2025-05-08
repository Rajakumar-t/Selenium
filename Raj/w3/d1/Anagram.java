package hw.w3.d1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stopas";
		String str2 = "potss";
		
		if (str1.length() == str2.length()) {
		}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray1);
		System.out.println(charArray2);
		
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are Anagram");
		}
			
	else {
		System.out.println("The given strings are not an Anagram");
}}}
