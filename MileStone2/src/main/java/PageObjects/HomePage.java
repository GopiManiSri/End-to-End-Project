package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

		public WebDriver driver;
		
		By search_bar= By.id("js-site-search-input");
		By search_icon=By.xpath("//*[@id='page-header']/div/span[3]/span[1]/form/button");
		By cups = By.xpath("//*[@id='prodItemImg0']");
		By addToBasket = By.xpath("(//*[@id='product-actions-btn-add'])[2]");
		By proceed = By.xpath("(//*[@id='btn-checkout'])[2]");
		public HomePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		public WebElement search_bar() {
			return driver.findElement(search_bar);
		}
		public WebElement search_icon() {
			return driver.findElement(search_icon);
		}
		public WebElement cups() {
			return driver.findElement(cups);
		}
		public WebElement addToBasket() {
			return driver.findElement(addToBasket);
		}
		public WebElement proceed() {
			return driver.findElement(proceed);
		}
}
