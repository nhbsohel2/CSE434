import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.ui.Screen;


class HeaderTop {

	
	//phone
	@Test
	public void isPhoneNumberCorrect() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");

		// Find div with phone number
		WebElement phoneNumberDIV = driver.findElement(By.xpath("//div[contains(@class,'header-phone')]"));
	
		assertEquals(phoneNumberDIV.getText(), "+123-456-789");
		driver.quit();
	
	
	}
//email test
	
	@Test
	public void isEmailTextCorrect() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");

		// Find div with email
		WebElement emailDIV = driver.findElement(By.xpath("//div[contains(@class,'header-email')]"));

		// Verify if email text is correct
		assertEquals(emailDIV.getText(), "info@travelagency.com");
		driver.quit();

	}
	
	//dolar
	@Test
	public void isUSDollarSelected() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");

		// Find dropdown menu of currency
		WebElement currency_dropdown = driver.findElement(By.id("currency"));

		// Create new select object
		Select currency = new Select(currency_dropdown);

		// Get first selected option
		WebElement firstSelected = currency.getFirstSelectedOption();

		// Verify if "US Dollar" selected
		assertEquals(firstSelected.getText(), "US Dollar");
		driver.quit();

	}
	
	
	//language selection
	
	@Test
	public void selectSpanishLanguage() {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://phptravels.net/");
		// Click on dropdown menu
		driver.findElement(By.xpath("//div[contains(@class, 'header-top')]//a[@class='dropdown-toggle']")).click();


		// Wait until page is reloaded
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlMatches("http://phptravels.net/es"));

		// Find <a> tag with selected language
		WebElement languageA = driver.findElement(By.xpath("//div[contains(@class, 'header-top')]//a[@class='dropdown-toggle']"));

		// Verify if "Spanish" language selected
		assertEquals(languageA.getText(), "Spanish");

	}
	

}
