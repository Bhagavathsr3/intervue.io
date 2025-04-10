package Tests;

import org.testng.annotations.Test;

import utility.Base;

public class LaunchUrl extends Base {
	@Test
	public void setup() {
		Launcher();
		launchURL("https://www.intervue.io");
		WindowMaximize();
	}
}
