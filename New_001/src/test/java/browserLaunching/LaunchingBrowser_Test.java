package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser_Test {
	

	//public static void main(String[] args) {
		
		@Test
		public void Launching()
		{
			
	    WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 WebDriver driver= new ChromeDriver(options);
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 }

	}


