package AdactinBase;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClassProject {
	public static WebDriver driver;

	public static WebDriver getdriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void getTitle(){
		String title2 = driver.getTitle();
		
	
	}

	public void closeTab() {
		driver.close();
	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void dragAndDrop(WebElement element,WebElement source,WebElement target) {
      Actions ac=new Actions(driver);
           ac.dragAndDrop(source,target).perform();
	}
	
	public void mouseOver(WebElement element,WebElement target) {
		 Actions ac=new Actions(driver);
		 ac.moveToElement(target).perform();;    
	}
	
	public void quit() {
      driver.quit();
	}
	
	public void ClickAndHoldAction(WebElement element,WebElement name) {
		 Actions ac=new Actions(driver);
		 ac.clickAndHold(name).release(name).perform();
    	}
	
	public void rightClick(WebElement element,WebElement button) {
		 Actions ac=new Actions(driver);
		 ac.contextClick(button).perform();
   	}
	
	public void doubleClick(WebElement text) {
		 Actions ac=new Actions(driver);
		 ac.doubleClick(text).perform();
   	}

	 public void simplealert() {
     Alert al=driver.switchTo().alert();
     al.accept();
	}
	 
	 public void confirmalert(String options) {
		 if (options.equalsIgnoreCase("accept")) {
			 Alert al=driver.switchTo().alert();
			 al.accept();
			 driver.switchTo().defaultContent();
		 }
		 else {
			 Alert al=driver.switchTo().alert();
			 al.dismiss();
	         driver.switchTo().defaultContent();
			 }
			 		}

	 public void promptalert(String options,String Value) {
		 if (options.contains("accept")) {
			Alert alert=driver.switchTo().alert();
			alert.accept();
			driver.switchTo().defaultContent();
		}else
		{
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(Value);
			alert.dismiss();
			driver.switchTo().defaultContent();
		}

	}

	public void scrollDown(String Value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Value, element);
	}

	public void screenShot(String data) throws IOException {
      TakesScreenshot ts=(TakesScreenshot) driver;		
      File sourcefile = ts.getScreenshotAs(OutputType.FILE);
      File destfile=new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
      FileUtils.copyFile(sourcefile, destfile);
	}

	//public void dropDown(WebElement element,String value) {
		//Select s=new Select(element);
	//	s.selectByValue(value);
//}
	public void dropDown(WebElement element,String option,String value) throws Exception {
		Select sc = new Select(element);
		if (option.equalsIgnoreCase("visibleText")) {
			sc.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
			sc.selectByIndex(Integer.parseInt(value));
		}else if (option.equalsIgnoreCase("value")) {
			sc.selectByValue(value);
		}else{
			throw new Exception("not a valid option");
		}
	}
	 public String attribute(WebElement element,String value) {
     String attribute = element.getAttribute(value);
     return attribute;
	}
	}
	
	
	



