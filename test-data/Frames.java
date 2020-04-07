import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement name = driver.findElement(By.id("fname"));
		
		name.sendKeys(Keys.CONTROL+"a");
		name.sendKeys(Keys.DELETE);		
		name.sendKeys("BUMBA");
		
		
		
		
		
	}

}
