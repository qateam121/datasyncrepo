package pages;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class DataSourcePage {
		
		ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

		FirefoxDriver driver;
		public DataSourcePage(FirefoxDriver driver){
		this.driver=driver;
	}
		public void clicksynchronizedtab() throws InterruptedException{
		
			//driver.switchTo().frame(1);
			
			
					
		driver.switchTo().frame("canvas-e3640f97-1328-48ed-b3d5-03ca7c0d2e12");
		System.out.println("i am in frame");
		
		WebDriverWait wait=new WebDriverWait(driver, 70);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rb.getString("datasou_synchrinized_xpath"))));
		
		//String ss=driver.findElementByXPath("//div[@class='body page fuelux']/div[1]/h4").getText();
		//System.out.println(ss);
		driver.findElementByXPath(rb.getString("datasou_synchrinized_xpath")).click();
		
			
			
		}

	}

