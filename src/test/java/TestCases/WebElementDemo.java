package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	 //Agregando WebDriver Manager
		
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
	  /*Buscando elementos con Selenium 4
				
				driver.get("https://google.com");
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("Selenium"+Keys.ENTER);
				//driver.findElement(By.name("btnK")).click();
	*/
				
	/*Get all the elements available with tag name 'select' 
				driver.get("https://trytestingthis.netlify.app/");
				
				java.util.List<WebElement> elements =driver.findElements(By.tagName("select"));
				
				for(WebElement element : elements) {
					System.out.println(element.getText());
				}
				
				*/
	//Find element within element
				driver.get("https://google.com/");
				
				
			
				
				
				
	
				
				
				
	 //No es recomendable utilizar pero para la demo utilizaremos esta sentencia.
				
				Thread.sleep(1200);
				
	//Cerrando nuestro webdriver
				
				driver.quit();
				driver.close();
			
				
				
	}

}
