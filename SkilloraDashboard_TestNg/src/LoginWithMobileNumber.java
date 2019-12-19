

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class LoginWithMobileNumber {
		WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver","E:\\Satish_Testing\\Selenium\\Web_Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://skillora-development.web.app/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		@Test(priority=1,groups="Title")
		public void SkilloraLogintext(){
			boolean b=driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/mat-card/mat-card-title")).isDisplayed();
		}
		
		
		@Test(priority=2,groups="Login with Mobile")
		public void LoginwithMobileButtonText() {
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/mat-card/div[1]/button[2]/span")).isDisplayed();
		}
		
		
		@Test(priority=3,groups="Login with Mobile")
		public void LoginwithMobileButton() {
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/mat-card/div[1]/button[2]")).click();	
		}
		
		
		@Test(priority=4,groups="Login with Mobile")
		public void MobileNumberText() {
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).isDisplayed();	
		}
		
		
		@Test(priority=5,groups="Login with Mobile")
		public void MobileNumberFeeld() {
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9701088633");	
		}
		
		
		@Test(priority=6,groups="Login with Mobile")
		public void PasswordText() {
			driver.findElement(By.xpath("//*[@id=\"password1\"]")).isDisplayed();
		}
		
		
		@Test(priority=7,groups="Login with Mobile")
		public void PasswordFeeld() {
			driver.findElement(By.xpath("//*[@id=\"password1\"]")).sendKeys("qwerty12345");
		}
		
		@Test(priority=8,groups="Login Button")
		public void LoginButtonText() {
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/mat-card/div[2]/form/button/span")).isDisplayed();
		}
		
		
		@Test(priority=9,groups="Login Button")
		public void LoginButtonTest() {
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/mat-card/div[2]/form/button")).click();
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		}
	}

