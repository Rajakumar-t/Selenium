package hw.w3.d1;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] stest = test.split(" ");
		for (int i=0;i<stest.length;i++) {
			if(i%2==1) {
			String outcome = " ";
		 for (int j=stest[i].length()-1;j>=0;j--) {
			 outcome += stest[i].charAt(j);
		 }System.out.print(outcome + " ");
		}	else {
			System.out.print(stest[i]);}		
		}
		}
	
}