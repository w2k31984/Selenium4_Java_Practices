package TestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		//Creando controlador web
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Agregando WebDriver Manager
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Utilizando el implicit wait. Default settings is 0 or (disabled).
		//Polling frequency 500 ms.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//LLendo al enlace para navegarlo.
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//JS Alert
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		
		//No es recomendable utilizar pero para la demo utilizaremos esta sentencia.
		Thread.sleep(2000);
		
		alert1.accept();
		if(driver.getPageSource().contains("You successfully clicked an alert"));
		    System.out.println("You succesfully clicked an alert");
		System.out.println("==========================================");
		

		//JS Confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		//No es recomendable utilizar pero para la demo utilizaremos esta sentencia.
		Thread.sleep(2000);
		
		
		if(driver.getPageSource().contains("You clicked: Ok"));
		    System.out.println("You clicked: Ok");
		System.out.println("==========================================");
		
		
		//JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Automation Step by Step");
		
		//No es recomendable utilizar pero para la demo utilizaremos esta sentencia.
				Thread.sleep(2000);
				
		alert3.accept();
		
		//No es recomendable utilizar pero para la demo utilizaremos esta sentencia.		
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("You entered: Automation Step by Step"));
	         System.out.println("You entered: Automation Step by Step");
	   System.out.println("==========================================");
	   
	   
	    //No es recomendable utilizar pero para la demo utilizaremos esta sentencia.		
	    Thread.sleep(2000);
		
		//Cerrando nuestro webdriver
		
		driver.close();
		driver.quit();
		
		
		
	}

}
