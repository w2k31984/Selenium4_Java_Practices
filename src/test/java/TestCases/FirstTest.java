package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FirstTest {
	//Creando metodo principal de la clase
	
	public static void main(String[] args) throws InterruptedException,IOException {
		
		//Creando controlador web
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Agregando WebDriver Manager
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Manejando tiempos de ejecucion en Selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		driver.get("https://google.com");
		
		//No es recomendable utilizar pero para la demo utilizaremos esta sentencia.
		
		Thread.sleep(6200);
		
		//Cerrando nuestro webdriver
		
		driver.close();
		driver.quit();
		
	}

}
