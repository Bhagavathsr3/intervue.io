package utility;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Robot rb;
	public static Actions a;
	//To launch a browser
public static void Launcher() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
// To launch a URL
public static void launchURL(String url) {
	driver.get(url);
}

//Mouse hover 1.movetoElement
public static void MouseHover(String string) {
	 a = new Actions(driver);
	 WebElement webElement = driver.findElement(By.xpath(string));
	a.moveToElement(webElement).perform();
}
//keyboard enter
public static void KeybrdEnter() throws AWTException {
	rb = new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
//down key 
public static void keybrdDownkey() throws AWTException  {
	rb = new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
}


//drop down by visible text
public static void dropdown(String drop1,String drop2) {
	WebElement e1 = driver.findElement(By.xpath(drop1));
	Select s = new Select(e1);
	s.selectByVisibleText(drop2);
}
//screenshot

public static void screenshot(String path) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File scrn = tk.getScreenshotAs(OutputType.FILE);
	File f1 = new File(path);
	FileUtils.copyFile(scrn, f1);
}
//Window maximize
	public static void WindowMaximize(){
		driver.manage().window().maximize();
	}
	
	public static void PageLoadtime(String URL) {
		long startTime = System.currentTimeMillis();
		launchURL(URL);
		long endtime =System.currentTimeMillis();
		//calculate page load time
		long loadTime = endtime-startTime;
		System.out.println("Page load time is :" + loadTime);
		Assert.assertTrue(loadTime<=3000,"Load time is slow");
		System.out.println("Load time is within 3 seconds");
	}
	
	public static void scroll(String ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement eleto = driver.findElement(By.xpath(ele));
		js.executeScript("arguments[0].scrollIntoView();",eleto);
			
			
	}
	public static void userclickAction(String ele) {
		driver.findElement(By.xpath(ele)).click();
	}
	
	//sendkeys
public static void usersendkeys(String ele, String val) {
	driver.findElement(By.xpath(ele)).sendKeys(val);
}
//scroll top
public static void scrolltop() {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollTo(0,0);");
}
public static void clearfield(WebElement input) {
	 a = new Actions(driver);
	a.click(input).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();	
}
public static void scrollbtm() {
	a = new Actions(driver);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
}
//To switch windows
public static void windowHandle() {
	String mainWindow = driver.getWindowHandle();
	Set<String> newWindows = driver.getWindowHandles();
	
	for(String windows: newWindows) {
		if(mainWindow!= windows) {
			driver.switchTo().window(windows);
		}
	}
}

}


