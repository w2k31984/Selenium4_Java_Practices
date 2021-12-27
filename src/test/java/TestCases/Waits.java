package TestCases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
    public static void main (String[]args) throws InterruptedException {
    	
    	//Creando controlador web
		
    			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    			
    			//Agregando WebDriver Manager
    			
    			WebDriverManager.chromedriver().setup();
    			
    			WebDriver driver = new ChromeDriver();
    			
    			//Utilizando el implicit wait. Default settings is 0 or (disabled).
    			//Polling frequency 500 ms.
    			
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    			
    			
    			//Manejando tiempos de ejecucion en Selenium 4
    			
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(5));
    			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    			
    			driver.get("https://google.com");
    			
    			//Buscando un elemento en google la casilla de buscar.
    			
    			driver.findElement(By.name("q")).sendKeys("automation step by step"+ Keys.ENTER);
    			
                //Utilizando el explicit wait.
    			//Polling frequency 500 ms.
    			
    			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    			WebElement myLink= wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: Never Stop Learning")));
    			myLink.click();
    			
    			
    			//Utilizando el fluent wait.
    			//Polling frequency -Se cambia por la necesidad
    			//Ignored exception En caso de que un elemento no sea encontrado Puede ignorar la excepcion "NoSuchElement".
    			
    			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
    			      .withTimeout(Duration.ofSeconds(10)) 
    			      .pollingEvery(Duration.ofSeconds(1))
    			      .ignoring(NoSuchElementException.class);
    			                     
    		   fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));                    
    			                      
    			
    			
    			//No es recomendable utilizar pero para la demo utilizaremos esta sentencia.
    			
    			//Thread.sleep(6200);
    			
    			//Cerrando nuestro webdriver
    			
    			driver.close();
    			driver.quit();
    			
    }
    
    
   	

}
