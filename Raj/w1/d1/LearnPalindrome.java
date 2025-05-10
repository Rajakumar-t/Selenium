package hw.w1.d2;

public class LearnPalindrome {
	public static void main(String[] args) {
		int n = 454, r, sum = 0, temp;
		System.out.println("given number" + " " + n);
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			
			System.out.println("its a palindrome");
		else
			System.out.println("not a plandrome");

	}
}
