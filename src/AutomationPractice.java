import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutomationPractice {
	public WebDriver driver;
	@Test
	public void autoParc()
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
//		WebElement wbelmnt = driver.findElement(By.linkText("Women"));
//		Actions act = new Actions(driver);
//		act.moveToElement(wbelmnt).perform();
		 WebElement webelmnt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		//act.click(wbelmt1).perform();
		
		driver.navigate().refresh();
//		driver.navigate().refresh();
//		driver.navigate().refresh();
		webelmnt.click();
		 driver.close();
	}
}
