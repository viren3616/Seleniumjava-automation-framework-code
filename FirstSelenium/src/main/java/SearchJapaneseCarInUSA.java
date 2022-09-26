import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchJapaneseCarInUSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SearchJapaneseCarInUSA");
		
		System.setProperty("webdriver.chrome.driver", "/Users/virenpatel/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//Loading the Page
		driver.get("https://google.com");
				
		//Sending keyword vehicle type for search
		driver.findElement(By.name("q")).sendKeys("Search Japanese Car In USA For Sale");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		// select https://https://carfromjapan.com/car/
	    driver.findElement(By.xpath("//h3[contains(text(),'CAR FROM JAPAN: Import Directly From Japanese Car ')]")).click();
	    
	    // Searching for New Arrivals Mini Truck 2022
	    driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/img[1]")).click();
	    
	    
	    // Click on Model Tab of Isuzu Elf Truck 1997 for sale 
	    driver.findElement(By.xpath("//strong[contains(text(),'Isuzu Elf Truck')]")).click();
	    
	    
	}

}