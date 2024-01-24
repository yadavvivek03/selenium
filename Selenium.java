package Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krih\\eclipse-workspace\\Techlistic\\chromeptah\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Vivek");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Yadav");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("739894");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		
	}

}
