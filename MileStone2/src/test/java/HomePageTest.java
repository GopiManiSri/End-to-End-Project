import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import PageObjects.HomePage;
import resources.base;

public class HomePageTest extends base {
	@BeforeTest
	public void initialize() throws IOException
	{
	
	 driver =initilizeDriver();
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	@Test
	public void Search() throws IOException, InterruptedException {

		
		driver.get(pro.getProperty("url"));
		Thread.sleep(5000);
		HomePage hp = new HomePage(driver);
		
		hp.search_bar().sendKeys("tea cups");
		Thread.sleep(3000);
		hp.search_bar().sendKeys(Keys.ENTER);
		//hp.search_icon().click();
		Thread.sleep(3000);
		hp.cups().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='product-details-name']")).getText(), "Raisa-Retro Printed Tea Mug");
		System.out.println("Cup Name Matched");
		hp.addToBasket().click();
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='shopping-basket-product-name-00']/a")).getText(), "Raisa-Retro Printed Tea Mug");
		System.out.println("Cup Name Matched");
		
		hp.proceed().click();
		Thread.sleep(5000);
		
	}
	

}
