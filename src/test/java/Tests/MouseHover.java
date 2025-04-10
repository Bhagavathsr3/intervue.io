package Tests;

import org.testng.annotations.Test;

import utility.Base;

public class MouseHover extends Base {
	@Test
public void hoverTabs() throws InterruptedException {
	MouseHover("(//*[text()='Products'])[1]");
	Thread.sleep(1000);
	
	MouseHover("(//*[text()='Solutions'])[1]");
	Thread.sleep(1000);
	
	MouseHover("(//*[text()='Resources'])[1]");
	Thread.sleep(1000);
}
}
