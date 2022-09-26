import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/virenpatel/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	
	}

}
