package hw.w4.d1;

public class JavaConnection extends MySqlConnection {

	
	public void connect() {
		System.out.println("connect");	
	}

	public void disconnect() {
		System.out.println("disconnect");
	}

	public void executeUpdate() {
		System.out.println("executeUpdate");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JavaConnection jv = new JavaConnection();
	jv.connect();
	jv.disconnect();
	jv.executeUpdate();
	jv.executeQuery();
}
}