package com.Obsquara.SeleniumProjectPractice.FirstWeek;

public class BrowserCommands extends BrowserInitialization {
	
	public void browserCommands()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		BrowserCommands commands = new BrowserCommands();
		commands.initialize();
		commands.browserCommands();

	}

}
