
package hw.w4.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingMissingElementsInList {

	public static void main(String[] args) {
		Integer []list = {1, 2, 3, 4, 10, 6, 8};
		List <Integer> newlist = new ArrayList <Integer>(Arrays.asList(list));{
			Arrays.sort(list);
			//Collections.sort(newlist);
			System.out.println(newlist);
			}
			for(int i=0;i<list.length-1;i++)
			//(int num : newlist)each
				{
				//int num = newlist.get(i);
				//int num1= newlist.get(i-1);
				if(list[i+1]!=list[i]+1) {
					for (int j=list[i]+1;j<list[i+1];j++) {
						System.out.print(j+" ");
					}
				}
				//if (i!=num1) {
					//1 != 1  2!=2 3=!=3 4!=4 5!=6 
					//System.out.print(i);
					
				}	
			}
}