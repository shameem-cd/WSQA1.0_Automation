package com.wellstack.metric;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MetricBuilderPatientInformation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "E:/Users/shameem.ks/Downloads/chromedriver_win32.exe");
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
		Thread.sleep(1000);
		//Click on Metric Builder
		driver.findElement(By.xpath("//span[@title='Metric Builder']")).click();
		Thread.sleep(1000);
		//Add Metric
		driver.findElement(By.xpath("//span[contains(text(),'Add Metric')]")).click();
		Thread.sleep(1000);
		//General Information
		driver.findElement(By.xpath("//input[@name='txtMetricName']")).sendKeys("MB TEST PATIENTINFO");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter the Description (Max 500 characters)']")).sendKeys("CB TEST PATIENTINFO");
		driver.findElement(By.xpath("//p-button[@title='Save as draft']")).click();
		Thread.sleep(1000);
		//Metric Definition- General information
		driver.findElement(By.xpath("//label[@class='ng-tns-c109-9 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'CB TEST 0519')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();	
		//Patient Information
		driver.findElement(By.xpath("//span[contains(text(),'Patient Information')]")).click();
		Thread.sleep(1000);
		//Patient Age
		driver.findElement(By.xpath("//span[contains(text(),'Patient Age')]")).click();
//		WebElement element = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[3]/p-dropdown[1]/div[1]/label[1]")); 
//		JavascriptExecutor js = (JavascriptExecutor)driver;   
//		js.executeScript("arguments[0].click();", element);	
		driver.findElement(By.xpath("//label[@class='ng-tns-c109-15 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		driver.findElement(By.xpath("//li[@aria-label='<=']")).click();
		driver.findElement(By.name("txtAge")).sendKeys("15");
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Sociodemographic Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Sociodemographic Code Groups')]")).click();
		Thread.sleep(1000);
		//Source - Internal
		driver.findElement(By.xpath("//label[@class='ng-tns-c109-20 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Internal')]")).click();
		Thread.sleep(1000);
		//Code Type - Language
		driver.findElement(By.xpath("//label[@class='ng-tns-c109-21 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")).click();		
		driver.findElement(By.xpath("//span[contains(text(),'Language')]")).click();
		Thread.sleep(1000);
		//Search
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		//Available Sociodemographic Code Groups
		driver.findElement(By.xpath("//div[contains(text(),'English Language ALL Definition')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.xpath("//div[@class='ui-grid-col-1 ng-star-inserted']")).click();
		//Next to Advance
		Thread.sleep(1000);
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
		Thread.sleep(3000);
		//Add
		WebElement element2 = driver.findElement(By.xpath("(//span[normalize-space()='Add'])[1]")); 
		JavascriptExecutor js2 = (JavascriptExecutor)driver;   
		js2.executeScript("arguments[0].click();", element2);
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
		Thread.sleep(3000);		
		WebElement chkbox3 = driver.findElement(By.cssSelector("div[class='col-sm-4 col-md-4 col-lg-4 ui-grid-col-4 align-left'] b[class='textcolor']"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(chkbox3);
		actions1.perform();
		//Next to Advance
		JavascriptExecutor js4 = (JavascriptExecutor)driver;   
		js4.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("//p-button[@label='Next to advance']")).click();
		Thread.sleep(1000);
		//Build Definition
		driver.findElement(By.xpath("//button[@title='Click here to build definition']")).click();
		Thread.sleep(1000);
		//Save As Draft & Next
		JavascriptExecutor js3 = (JavascriptExecutor)driver;   
		js3.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-metric-builder[1]/section[1]/app-metric-template[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-metric-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-build-definition[1]/div[1]/div[1]/div[1]/div[4]/div[3]/p-button[3]/button[1]/span[1]")).click();		
//		//Execute
//		driver.findElement(By.xpath("//span[contains(text(),'Execute')]")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
}

	
}
