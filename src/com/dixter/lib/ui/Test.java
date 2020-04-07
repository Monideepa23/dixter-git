import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Test JAVA");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
			
		driver.quit();
	}

}
