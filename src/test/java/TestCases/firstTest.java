package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class firstTest {
	/*Creando metodo principal de la clase*/
	
	public static void main(String[] args) {
		
		/*Creando controlador web*/
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		/*Agregando WebDriver Manager*/
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		/*Manejando tiempos de ejecucion en Selenium 4*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		/*Cerrando nuestro webdriver*/
		
		driver.close();
	}

}
