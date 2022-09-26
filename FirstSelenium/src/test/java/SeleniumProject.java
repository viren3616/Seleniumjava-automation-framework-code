import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/virenpatel/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tanchan-001-site3.btempurl.com/production/admin/");
		
		//send the user name to the text box
		
		driver.findElement(By.xpath("//input[@id='AUser']")).sendKeys("admin");
		System.out.println("send username to usernametextbox");
		//Password
		driver.findElement(By.xpath("//input[@id='APwd']")).sendKeys("yesm");
		System.out.println("send pwd to password textbox");
		//click the submit button
		
		driver.findElement(By.id("ABtn")).click();
		System.out.println("Click on Submit");
		//driver.get("https://www.americanexpress.com/en-us/account/login?inav=iNavLnkLog");
		
		//driver.findElement(By.xpath("//input[@id='eliloUserID']")).sendKeys("username");
		
		//driver.findElement(By.xpath("//input[@id='eliloPassword']")).sendKeys("password");
		
		//driver.findElement(By.id("loginSubmit")).click();
		
		
		//driver.get("https://apply.rivier.edu/");
		
		//driver.findElement(By.id("//span[contains(text(),'Sign In')]")).click();
		//driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("vpatel@rivier.edu");
		//driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Hdhpramukh007$");
		
		//driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/elm-sign-in-dialog[1]/elm-dialog[1]/mat-dialog-actions[1]/elm-dialog-actions[1]/div[1]"));
	
	
		
		//Implicit way
		
		
		
		
		
		//Explicit way
		
		
		
		//it will wait for the only until the object 
		
		
		
	}

}
