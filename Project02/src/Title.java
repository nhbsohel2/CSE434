import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Title {

	@Test
	void test() {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\NHBSOHEL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.phptravels.net");
		String expected="PHPTRAVELS | Travel Technology Partner";
		String title=driver.getTitle();
		assertEquals(expected, title, "Success");
		driver.close();
		//System.out.println(title);
		
		/*if(title.equals("PHPTRAVELS | Travel Technology Partner")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Wrong Title");
		}*/
		
		
		
	}

}
