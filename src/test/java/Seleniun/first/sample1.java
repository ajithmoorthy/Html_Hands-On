package Seleniun.first;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sample1 {

	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	/* @Before */
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	/*
	 * @After
	 */
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void sample1() {
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().setSize(new Dimension(1366, 738));
		driver.findElement(By.linkText("Features")).click();
		{
			WebElement element = driver.findElement(By.linkText("Blog"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.linkText("Blog"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.linkText("Blog"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).release().perform();
		}
		driver.findElement(By.linkText("Blog")).click();
		driver.findElement(By.id("cat-chooser")).click();
		{
			WebElement dropdown = driver.findElement(By.id("cat-chooser"));
			dropdown.findElement(By.xpath("//option[. = 'Spanish']")).click();
		}
		driver.findElement(By.id("cat-chooser")).click();
		driver.findElement(By.linkText("Services")).click();
		{
			WebElement element = driver.findElement(By.linkText("EN"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element, 0, 0).perform();
		}
	}
}
