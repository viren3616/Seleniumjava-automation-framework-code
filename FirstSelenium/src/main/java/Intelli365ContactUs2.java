import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intelli365ContactUs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Verified that the contact us page displayed updated information correctly");
		
		System.setProperty("webdriver.chrome.driver", "/Users/virenpatel/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//Loading the Page
		driver.get("https://google.com");
		
		//Sending keyword vehicle type for search
		driver.findElement(By.name("q")).sendKeys("Intelli365");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	    // select https://www.intelli365.com//
	    driver.findElement(By.xpath("//h3[contains(text(),'Intelli 365 – Intelli 365')]")).click();
	    
	    // Navigate to Feature Page
	    driver.findElement(By.xpath("//span[contains(text(),'Contact us')]")).click();
	    
	    // Send correct name to Name TextBox
	    System.out.println("Send correct name to Name TextBox");
	    driver.findElement(By.xpath("//input[@name='your-name']")).sendKeys("dfgh vbfh");
	    System.out.println("The Field is Required");
	    
	    // Send correct EmailID to Name Your Email TextBox
	    System.out.println("Send correct Email to Email TextBox");
	    driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("fghtyu@gmail.com");
	    System.out.println("The Field is Required");

	    System.out.println("The names and email addresses are not properly formatted");
	    driver.findElement(By.xpath("//input[@value='Send']")).click();
	}

}
