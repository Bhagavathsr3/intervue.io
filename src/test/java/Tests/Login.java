package Tests;

import org.testng.annotations.Test;

import utility.Base;

public class Login extends Base {

	
	@Test(priority = 1)
public void loginDetails() throws InterruptedException {
	
	userclickAction("(//*[text()='Login'])[1]");
	Thread.sleep(2000);
	windowHandle();
	userclickAction("(//*[text()='Login'])[3]");
	Thread.sleep(2000);
	
	usersendkeys("//*[@id='login_email']", "neha@intervue.io");
	usersendkeys("//*[@id=\"login_password\"]", "Ps@neha@123");
	userclickAction("//button[@type='submit']");
	Thread.sleep(2000);
}
	@Test(priority = 2)
public void serachBar() throws InterruptedException {
		
	driver.navigate().refresh();	
	userclickAction("//*[text()='Search by candidate name, profile etc.']");
	
	Thread.sleep(2000);
	usersendkeys("//input[@placeholder='Type what you want to search for']", "hello");
	
	userclickAction("//*[@class='style__SearchLensIconWrap-pqpu-7 jSCYnG']");
	Thread.sleep(2000);
}
	@Test(priority = 3)
	public void logout() throws InterruptedException {
		
		userclickAction("(//*[@class='anticon'])[3]");
		Thread.sleep(2000);
		userclickAction("//*[text()='Logout']");
	
	}
}

