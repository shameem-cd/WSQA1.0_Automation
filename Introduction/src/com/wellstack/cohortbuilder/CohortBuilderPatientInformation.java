package com.wellstack.cohortbuilder;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CohortBuilderPatientInformation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Users\\shameem.ks\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Login 
		driver.get("https://wsqa.symphonycare.com/login");
		driver.findElement(By.name("username")).sendKeys("shameen.ks@wellstack.ai");
		driver.findElement(By.name("password")).sendKeys("Iamatester7@");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(1000);
		//Two-Factor Authentication
		driver.findElement(By.name("answerOne")).sendKeys("Soubiya");		
		driver.findElement(By.name("answerTwo")).sendKeys("White");
		driver.findElement(By.name("answerThree")).sendKeys("Fish");
		driver.findElement(By.xpath("/html/body/app-root/app-security-questions/div/div/div/div/div/form/div[4]/div/div[2]/button[1]")).click();
		//Expand Report Builder
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Report Builder']")).click();
		//Click on Cohort Builder
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Cohort Builder']")).click();
		//Add Cohort
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Add Cohort')]")).click();
		Thread.sleep(1000);
		//General Information
		driver.findElement(By.xpath("//input[@name='txtDefinitionName']")).sendKeys("CB TEST PATIENT");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Description for this definition (Max 500 characters)']")).sendKeys("CB TEST PATIENT INFORMATION");
		driver.findElement(By.xpath("//span[contains(text(),'Save As Draft & Next')]")).click();
		Thread.sleep(1000);
		//Select Criteria - Expand Patient Information
		driver.findElement(By.xpath("//span[contains(text(),'Patient Information')]")).click();
		Thread.sleep(1000);
		//Patient Age
		driver.findElement(By.xpath("//span[contains(text(),'Patient Age')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='<=']")).click();
		driver.findElement(By.name("txtAge")).sendKeys("15");
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Sociodemographic Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Sociodemographic Code Groups')]")).click();
		Thread.sleep(1000);
		//Source - Internal
//		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible ui-dropdown-hidden-select'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Internal')]")).click();
		Thread.sleep(1000);
		//Code Type - Language
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[2]")).click();		
		driver.findElement(By.xpath("//span[contains(text(),'Language')]")).click();
		Thread.sleep(1000);
		//Search
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		//Available Sociodemographic Code Groups
		driver.findElement(By.xpath("//div[contains(text(),'English Language ALL Definition')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		//driver.findElement(By.xpath("//div[@class='ui-grid-col-1 ng-tns-c22-12 ng-star-inserted']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//Next to Advance
		driver.findElement(By.xpath("//p-button[@label='Next to advance']")).click();
		Thread.sleep(1000);
		//Sroll up to reach Criteria Statements
		WebElement chkbox = driver.findElement(By.xpath("//b[contains(text(),'Criteria Statements')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(chkbox);
		actions.perform();
		Thread.sleep(1000);
		//Selection of Checkboxes
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		//Add
		WebElement element = driver.findElement(By.xpath("(//span[normalize-space()='Add'])[1]")); 
		JavascriptExecutor js = (JavascriptExecutor)driver;   
		js.executeScript("arguments[0].click();", element);
		//scroll down to reach - AddCriteria Set
		WebElement chkbox2 = driver.findElement(By.xpath("//span[contains(text(),'Add Criteria Set')]"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(chkbox2);
		actions2.perform();
		Thread.sleep(1000);
		//Click on Add Criteria Set
		WebElement element1 = driver.findElement(By.xpath("(//span[normalize-space()='Add Criteria Set'])[1]"));    
		JavascriptExecutor js1 = (JavascriptExecutor)driver;   
		js1.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		WebElement chkbox3 = driver.findElement(By.cssSelector("div[class='col-sm-4 col-md-4 col-lg-4 ui-grid-col-4 align-left'] b[class='textcolor']"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(chkbox3);
		actions1.perform();
		//Next to Advance
		JavascriptExecutor js2 = (JavascriptExecutor)driver;   
		js2.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("//p-button[@label='Next to advance']")).click();
		Thread.sleep(1000);
		//Build Definition
		driver.findElement(By.xpath("//button[@title='Click here to build definition']")).click();
		Thread.sleep(1000);
		//Save As Draft & Next
		JavascriptExecutor js3 = (JavascriptExecutor)driver;   
		js3.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable'][normalize-space()='Save As Draft & Next'])[2]")).click();
		//Execute
//		driver.findElement(By.xpath("//span[contains(text(),'Execute')]")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();

	
		
		

}

	
}
