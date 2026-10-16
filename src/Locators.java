import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Pawan/softs/Java softwares/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		WebElement userName = driver.findElement(By.id("inputUsername"));
		userName.sendKeys("Pawan");
		
		driver.findElement(By.name("inputPassword")).sendKeys("abc");   //rahulshettyacademy
		driver.findElement(By.className("signInBtn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement errorMsg = driver.findElement(By.cssSelector("p.error"));
	//	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		System.out.println(errorMsg.getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pawan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("pawan@gmail.com");
		
		//Assert.assertEquals(null, null);

	}

}
