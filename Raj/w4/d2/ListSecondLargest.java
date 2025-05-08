package hw.w4.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSecondLargest {

	public static void main(String[] args) {
	Integer [] list = {3, 2, 11, 4, 6, 7};
	List <Integer> list1 = new ArrayList <Integer>(Arrays.asList(list));
	{
		//this can done too 
		//for (int i=0; i<list.length;i++) {
			//list1.add(list[i]);
			Collections.sort(list1);
		
		System.out.println("Sorted list");
		System.out.println(list1);
		int sl = list1.get(list1.size()-2);
		System.out.println("Second Largest number is : "+sl);
	}
}
}