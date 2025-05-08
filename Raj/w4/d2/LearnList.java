package hw.w4.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LearnList {

	public static void main(String[] args) {
		Integer[] list1 = {3, 2, 11, 4, 6, 7};
		Integer[] list2 = {1, 2, 8, 4, 9, 7};
		List <Integer> newlist1 = new ArrayList <Integer> (Arrays.asList(list1));
		List <Integer> newlist2 = new ArrayList <Integer> (Arrays.asList(list2));
		//for (int i=0;i<list1.length;i++) {
			//newlist1.add(list1[i]);
		//}
		//for (int i=0;i<list2.length;i++) {
			//newlist2.add(list2[i]);
		
		System.out.println("values that are equal :");
		for (int i=0;i<newlist1.size();i++) {
			int num =newlist1.get(i);
			
			if(newlist2.contains(num)) {
				System.out.print(num+" ");
			}
		}
	}

}
