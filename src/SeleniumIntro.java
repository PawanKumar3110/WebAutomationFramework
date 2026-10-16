import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/Pawan/softs/Java softwares/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String Title = driver.getTitle();
		System.out.println("Title: " + Title);
	
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + CurrentURL);
		
		WebElement searchBox = driver.findElement(By.className("gLFyf"));

		// Click to focus, type the query and wait for suggestions to appear
		searchBox.click();
		searchBox.sendKeys("How to drive a ");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.cssSelector("ul[role='listbox'] li"));
		
		for(WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
			Thread.sleep(2000);
			if(suggestion.getText().equals("how to drive a car")) {
				suggestion.click();
				break;
			}
		}
		
		

		// Sometimes sending an extra keystroke helps trigger the autocomplete
//		searchBox.sendKeys(Keys.SPACE);
//		searchBox.sendKeys(Keys.BACK_SPACE);

		// Wait for the suggestion list to be present and have at least one item
	/**	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By suggestionsLocator = By.cssSelector("ul[role='listbox'] li");
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(suggestionsLocator, 0));
		} catch (Exception e) {
			System.out.println("Timed out waiting for suggestions: " + e.getMessage());
		}

		List<WebElement> suggestions = driver.findElements(suggestionsLocator);

		if (suggestions.isEmpty()) {
			System.out.println("No suggestions found. Try increasing the wait time or check the locator.");
		} else {
			// Print suggestions
			for (WebElement suggestion : suggestions) {
				System.out.println(suggestion.getText());
				
				
			}  
			
			
		} **/

		
		
       // driver.quit();
		
	}

}
