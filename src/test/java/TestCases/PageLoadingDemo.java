package TestCases;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {
	
	public static void main(String[] args) throws InterruptedException {
	
	/*Page Loading estrategia Normal
		
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);*/
	
	
	/*Page Loading estrategia EAGER
	
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);*/
	
	//Page Loading estrategia NONE
	
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	
	//Agregando WebDriver Manager

	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver(options);
	

	driver.get("https://google.com");
	
	Thread.sleep(5200);
	
	//Cerrando nuestro webdriver

	driver.close();
	driver.quit();
			
			
	

  }
	
}
