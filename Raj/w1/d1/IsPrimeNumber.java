
package hw.w1.d2;

public class IsPrimeNumber {

	public static void main(String[] args) {
int n=5, count = 0;
		
		for (int i=1;i<=n;i++) {
		if (n%i==0) {
		count++;
		}
		
		if (count == 2) {
            System.out.println("Given number " + n + " is a prime number");
           
        } 
        else {
            System.out.println("Given number " + n + " is not a prime number");
        }
		break;
		}
		//String result = (count==2)? "Its prime number":"not a prime number";
		//System.out.println(result);
		
	}
	
}
