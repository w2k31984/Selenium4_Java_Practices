package TestCases;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
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

		/*Solicitando navegar en un sitio*/
	
		//driver.navigate().to("https://automationstepbystep.com/");
		
		//Saber la url en que se esta navegando.
		/*
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//Acciones del navegador
		
		driver.navigate().back();
		
		//En un proyecto real no se recomienda esto pero es necesario hacerlo para ver la interaccion.
		
		Thread.sleep(5300);
		
		driver.navigate().forward();
		
		Thread.sleep(5300);
		
		driver.navigate().refresh();
		
		
		//Abriendo una nueva ventana del navegador
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//Abriendo una nueva pestaña en el navegador
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Salto de pagina de navegador
		
		driver.switchTo().window(originalWindow);
		
		
		//Elemento tipo frame con selenium4
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-sumary.html");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().defaultContent();
		
		
		//Administracion de ventanas con selenium4
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		
		//Dimensionando la ventana
		Dimension size = driver.manage().window().getSize();
		
		
		//Viendo el tamaño y largo de nuestra ventana
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		//Estableciendo el tamaño de la ventana.
		driver.manage().window().setSize(new Dimension(800,600));
		
		//Posiciones de ventana.
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		//Estableciendo posicion de la ventana
		driver.manage().window().setPosition(new Point(500,100));
	
		
		//Maximizar ventana
		driver.manage().window().maximize();
		Thread.sleep(3200);
		
		//Minimizar ventana
		driver.manage().window().minimize();
		Thread.sleep(3200);
		
		//Toda la pantalla
		driver.manage().window().fullscreen();
	
		
		//Capturas de pantalla con selenium4
		
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./Screenshots/image1.png"));
		
		//Tomando captura de pantalla de un elemento particular con selenium4
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		File srcFile1 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("./Screenshots/image2.png"));
		*/
		
		
		//Ejecucion de Java Script en selenium4
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click;", button);
		
		//Ejecucion directa de codigo Java Script en selenium4
		js.executeScript("console.log('Hola estoy ejecutandome como codigo JS con Selenium4')");
		
		
		Thread.sleep(5200);
		
		//Cerrando nuestro webdriver

		driver.close();
		driver.quit();
	}

}
