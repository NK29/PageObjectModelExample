package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase{
	@Test
	public void login() throws InterruptedException{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Documents\\Naveen Kumar S\\exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.submit.click();	
		
	}
}