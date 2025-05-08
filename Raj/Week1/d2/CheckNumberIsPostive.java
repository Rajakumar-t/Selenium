package hw.w1.d2;

public class CheckNumberIsPostive {

	public static void main(String[] args) {
		int a = 1;
		if (a > 0) {
			System.out.println("The Number is Postive");
		}

		else {
			System.out.println("The number is Negetive");

		}
		String result = (a > 0) ? "The number is Postive" : "The number is Negetive ";
		System.out.println(result);
	}

}
