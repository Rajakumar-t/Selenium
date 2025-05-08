package hw.w3.d1;

import java.util.Arrays;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count =0;
		System.out.println("Input : "+text);
		String[] word=text.split(" ");
		System.out.println("split text;"+Arrays.toString(word));
		for(int i = 0;i<word.length;i++) {
			for (int j=i+1; j<word.length;j++) {
				if (word[i].equalsIgnoreCase(word[j])){
					word[j]="";
					count++;
				}
			}
		}
				if (count>0) 
				System.out.println("Output :");
				for(int k=0;k<word.length;k++) {
					if (!word[k].equals("")) 
					System.out.print(word[k]+" ");
				}
	}
}
