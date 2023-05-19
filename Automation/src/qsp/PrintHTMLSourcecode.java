package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHTMLSourcecode {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		String code = driver.getPageSource();
		
		System.out.println(title);
		
		System.out.println(code);
		
		driver.close();

	}

}
