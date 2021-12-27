package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Agregando WebDriver Manager

				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();
				
				String originalWindow = driver.getWindowHandle();

		//Manejando tiempos de ejecucion en Selenium 4

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(5));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

				driver.get("https://google.com");
		
	  //Buscando elementos en el sitio web.
				
				//WebElement searchBox = driver.findElement(By.name("q"));
				//searchBox.sendKeys("ABCD", Keys.ENTER);
				
				
	//Localizando simples y multiples elementos
				/*
			    driver.navigate().to("https://trytestingthis.netlify.app/");
				List<WebElement> options= driver.findElements(By.name("Optionwithcheck[]"));
				
				for(WebElement element : options) {
					System.out.println(element.getText());
				}
				
	 //Utilizando la propiedad ID de un elemento
				
				driver.findElement(By.cssSelector("#fname")).sendKeys("Cristian");
				*/
				
	 //Utilizando localizadores relativos.
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
				
				WebElement loginButton = driver.findElement(By.id("btnlogin"));
				
				driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("ABCD");
			    
				
	  //No es recomendable utilizar pero para la demo utilizaremos esta sentencia.		
				Thread.sleep(2000);
				
	  //Cerrando nuestro webdriver

				driver.close();
				driver.quit();

	}

}
