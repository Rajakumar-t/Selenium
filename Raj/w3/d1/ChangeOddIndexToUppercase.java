package hw.w3.d1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		 String test = "changeme";
		 char [] chararray = test.toCharArray();
		 for (char  i = 0; i<test.length();i++) {
			 if (i%2 !=0) {
				 chararray[i]= Character.toUpperCase(chararray[i]); 
			 }
		 }
		System.out.println(chararray); 
	}

}
