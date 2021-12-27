package TestCases;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProxyDemo {
	public static void main(String[] args) throws InterruptedException {
		
		//Creando el nuevo proxy
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		proxy.setHttpProxy("localhost:8888");
		proxy.setSslProxy("localhost:8888");
		
		//Abriendo con navegador Chrome.
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", false);
		
		
		//Agregando WebDriver Manager
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver(options);
		
		Thread.sleep(2500);
		
		driver.get("https://google.com");
		driver.quit();
	}

}
