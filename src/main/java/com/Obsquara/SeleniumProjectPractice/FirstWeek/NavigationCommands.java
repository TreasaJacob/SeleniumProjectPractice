package com.Obsquara.SeleniumProjectPractice.FirstWeek;

public class NavigationCommands extends BrowserInitialization {
	public void navigationCommands()
	{
		driver.navigate().to("https://www.facebook.com/login.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands commands = new NavigationCommands();
		commands.initialize();
		commands.navigationCommands();
		commands.browserClose();

	}

}
