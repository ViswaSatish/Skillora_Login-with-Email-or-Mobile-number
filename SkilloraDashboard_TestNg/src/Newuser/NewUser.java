package Newuser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewUser {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E:\\Satish_Testing\\Selenium\\Web_Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://skillora-dashboard.firebaseapp.com/auth/user-managementForm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test(priority=1,groups="Title")
	public void SkilloraAdminText(){
		boolean b=driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[1]/span/span")).isDisplayed();
	}
@Test(priority=1,groups="Title")
public void SkilloraLogintext(){
	boolean b=driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[1]/span/span")).isDisplayed();
		
}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
	}
}
