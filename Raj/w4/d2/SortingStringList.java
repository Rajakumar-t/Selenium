package hw.w4.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringList {

	public static void main(String[] args) {
		String[] word = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> newword = new ArrayList<String>(Arrays.asList(word));
		Collections.sort(newword);
		//System.out.println(newword);
		for (int i = newword.size()-1;i>=0;i--) {
				System.out.print(newword.get(i));
				if (i != 0) System.out.print(", ");
			}
		}
}
