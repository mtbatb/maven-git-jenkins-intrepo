package Git_Jenkins_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIntegration {

	@Test
	public void TestMethod()
	{
		System.out.println("TestMEthod....yoganand.");
		
		//System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userId=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		userId.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		
		WebElement btnLogin=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		btnLogin.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
}
