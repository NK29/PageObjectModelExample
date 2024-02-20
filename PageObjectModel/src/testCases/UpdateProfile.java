package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfile {
	@Test
	public void login() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Documents\\Naveen Kumar S\\exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.userName(driver).sendKeys("Admin");
		LoginPageObjects.passWord(driver).sendKeys("admin123");
		LoginPageObjects.loginButton(driver).click();
		
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		UpdateProfileObjects.MyInfo.click();
		UpdateProfileObjects.EmployeeID.sendKeys("6090");
		UpdateProfileObjects.DriverLN.sendKeys("KA51HF7405");
		UpdateProfileObjects.saveButton.click();
		
}
}