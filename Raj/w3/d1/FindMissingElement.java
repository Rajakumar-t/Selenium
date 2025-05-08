package hw.w3.d1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 8, 6, 7 };
		Arrays.sort(a);
		//int lengthOfArray = a.length;
		for (int i = 0; i < a.length-1; i++) {
			// 1 2 3 4 6 7 8
			if (a[i + 1] != a[i] + 1) {
				System.out.println("Missing Number" + " " + (a[i] + 1));
				//return;
			}

		}

	}

}
