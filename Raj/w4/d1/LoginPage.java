package hw.w4.d1;

public class LoginPage extends BasePage {
	
	
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("LoginPage");
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommonTasks();
		lp.clickElement();
		lp.enterText();	
	}

}
