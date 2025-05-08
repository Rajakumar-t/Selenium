package hw.w4.d1;

public class APIClient {
	
	public void sendRequest(String a) {
		System.out.println(a);
	}
	public void sendRequest(String a, String b, boolean c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		APIClient ap = new APIClient();
		ap.sendRequest("I am Ram ");
		ap.sendRequest("No ", "your ", false);
	}

}
