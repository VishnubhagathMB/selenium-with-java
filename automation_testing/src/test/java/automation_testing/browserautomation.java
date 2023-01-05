package automation_testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class browserautomation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		
		List<WebElement> fields = driver.findElements(By.tagName("input"));
		System.out.println("input field present are" + fields);
		
				driver.findElement(By.name("first_name")).sendKeys("vishnu");
				driver.findElement(By.name("last_name")).sendKeys("bhagath");
				driver.findElement(By.name("business_name")).sendKeys("abc");
				driver.findElement(By.name("email")).sendKeys("vishnubhagath@gmail.com");
				
				
				
				Actions act = new Actions(driver);
				WebElement target = driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/ul[1]/li[5]/a[1]"));
				act.moveToElement(target);
				driver.manage().window().maximize();
				
				
				
			//Select DropDown = new Select(driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/ul[1]/li[3]/a[1]\r\n"
			//		)));
						
		//DropDown.selectByVisibleText("Main Features");
		
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/div[6]/ul[1]/li[1]/a[1]")).click();
		//driver.navigate().back();
		
		driver.navigate().refresh();
		driver.quit();

	}

}
