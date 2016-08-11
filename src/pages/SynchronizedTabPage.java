package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizedTabPage {
	
	ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

	FirefoxDriver driver;
	public SynchronizedTabPage(FirefoxDriver driver){
	this.driver=driver;
}
	public void clicktoEntitiesArea(){
		
		WebDriverWait wait=new WebDriverWait(driver, 70);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rb.getString("synchronizedTab_clickentityArea_xpath")))).click();
		
		//driver.findElementByXPath(rb.getString("synchronizedTab_clickentityArea_xpath")).click();
	}

}
