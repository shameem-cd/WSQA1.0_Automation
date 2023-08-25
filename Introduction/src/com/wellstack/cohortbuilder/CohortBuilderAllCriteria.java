package com.wellstack.cohortbuilder;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.JavaConstant.Dynamic;
public class CohortBuilderAllCriteria {

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
		Thread.sleep(2000);
		//General Information
		driver.findElement(By.xpath("//input[@name='txtDefinitionName']")).sendKeys("CB ALL CRITERIA");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Description for this definition (Max 500 characters)']")).sendKeys("CB ALL CRITERIA");
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
		//Select Criteria - Diagnosis Codes
		driver.findElement(By.xpath("//span[contains(text(),'Diagnosis Codes')]")).click();
		Thread.sleep(1000);
		//ICD-9-CM Diagnosis Codes
		driver.findElement(By.xpath("//span[contains(text(),'ICD-9-CM Diagnosis Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("fever");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'0654 - Mosquito-borne hem fever')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'0820 - Spotted fevers')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//ICD-10-CM Diagnosis Codes
		driver.findElement(By.xpath("//span[contains(text(),'ICD-10-CM Diagnosis Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("fever");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'R6883 - Chills (without fever)')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'A959 - Yellow fever, unspecified')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();		
		//Procedure Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Diagnosis Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Test Grouper Diagnosis')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		//Scroll down to reach Save Button
		WebElement chkbox1 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(chkbox1);
		actions1.perform();
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//Select Criteria - Expand Frequency Codes
		driver.findElement(By.xpath("//span[contains(text(),'Frequency Codes')]")).click();
		Thread.sleep(1000);
		//Frequency Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Frequency Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Medication Frequency - Daily ALL Definition')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();		
		//Sroll Down to reach Save button
		WebElement chkbox2 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(chkbox2);
		actions2.perform();
		Thread.sleep(1000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Select Criteria - Expand Measure Codes
		driver.findElement(By.xpath("//span[contains(text(),'Measure Codes')]")).click();
		Thread.sleep(1000);
		//LOINC Codes 
		driver.findElement(By.xpath("//span[contains(text(),'LOINC Codes')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter min 5 characters']")).sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		driver.findElement(By.xpath("//div[contains(text(),'28385-3 - Fever [HIV-SSC]')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Lab Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Lab Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[2]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'BMI (Measure) ALL Definition')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		//Scroll Down to reach Save button
		WebElement chkbox3 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(chkbox3);
		actions3.perform();
		Thread.sleep(2000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Select Criteria - Expand Medication Codes
		driver.findElement(By.xpath("//span[contains(text(),'Medication Codes')]")).click();
		Thread.sleep(1000);
		//National Frug Codes (NDC)  
		driver.findElement(By.xpath("//span[contains(text(),'National Drug Codes (NDC)')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter 3 min chars']")).sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		driver.findElement(By.xpath("//div[contains(text(),'55714150301 - Fever Infection')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Medication Code Groups
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medication Codes')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Medication Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[2]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'ASCG 06/13')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		Thread.sleep(1000);
		WebElement chkbox4 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions4 = new Actions(driver);
		actions4.moveToElement(chkbox4);
		actions4.perform();
		Thread.sleep(5000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Select Criteria - Procedure Codes
		driver.findElement(By.xpath("//span[contains(text(),'Procedure Codes')]")).click();
		Thread.sleep(1000);
		//CPT Codes
		driver.findElement(By.xpath("//span[contains(text(),'CPT Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("20 -");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'76120 - CINERADIOGRAPY/VIDRADIOGRAPY XCPT WHERE SPEC')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//HCPCS Codes
		driver.findElement(By.xpath("//span[contains(text(),'HCPCS Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("20 -");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'A0120 - Noner transport mini-bus')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//ICD-9-CM Procedure Codes
		driver.findElement(By.xpath("//span[contains(text(),'ICD-9-CM Procedure Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("20 -");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'0920 - Exc lacrimal gland NOS')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//ICD-10-CM Procedure Codes
		driver.findElement(By.xpath("//span[contains(text(),'ICD-10-CM Procedure Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("021");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'021008F - Bypass Coronary Artery, One Artery from Abdominal Artery with Zooplastic Tissue, Open Approach')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//CPT-CAT-II Codes
		driver.findElement(By.xpath("//span[contains(text(),'CPT-CAT-II Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("cpt");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'4019F - DOC RE - CPT COUNSL VIT D/CALC+')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//CPT-CAT-III Codes
		driver.findElement(By.xpath("//span[contains(text(),'CPT-CAT-III Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("cpt");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'0055T - CPTR-ASST MUSCSKEL NAVIGJ ORTHO CT/MRI')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//Procedure Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Procedure Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Standard - 0616')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		WebElement chkbox5 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions5 = new Actions(driver);
		actions5.moveToElement(chkbox5);
		actions5.perform();
		Thread.sleep(1000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//Select Criteria - Expand ServiceLocation Codes Codes
		driver.findElement(By.xpath("//span[contains(text(),'Service Location Codes')]")).click();
		Thread.sleep(1000);
		//CMS Place of Service Codes
		driver.findElement(By.xpath("//span[contains(text(),'CMS Place of Service Codes')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter 3 min chars'])[1]")).sendKeys("20 -");
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'20 - Location, distinct from a hospital emergency room, an office, or a clinic, whose purpose is to diagnose and treat illness or injury for unscheduled, ambulatory patients seeking immediate medical attention.')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//Service Location Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Service Location Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Provider Location - Valid Place of Service codes - Diabetes - WCHQ ALL Definition')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		WebElement chkbox6 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions6 = new Actions(driver);
		actions6.moveToElement(chkbox6);
		actions6.perform();
		Thread.sleep(1000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		//Select Criteria - Expand Speciality Codes
		driver.findElement(By.xpath("//span[contains(text(),'Specialty Codes')]")).click();
		Thread.sleep(1000);
		//Speciality Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Specialty Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("txtTimes")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[6]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Primary Care Physician Specialty Codes - Depression Remission - WCHQ ALL Definition')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		WebElement chkbox7 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions7 = new Actions(driver);
		actions7.moveToElement(chkbox7);
		actions7.perform();
		Thread.sleep(2000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
		//Select Criteria - Expand Status Codes
		driver.findElement(By.xpath("//span[contains(text(),'Status Codes')]")).click();
		Thread.sleep(1000);
		//Frequency Code Groups
		driver.findElement(By.xpath("//span[contains(text(),'Status Code Groups')]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Internal']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/section[1]/app-admin[1]/div[1]/div[1]/div[2]/app-population-definition[1]/section[1]/app-pd-template[1]/div[1]/div[1]/div[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[2]/div[1]/app-pd-criteria[1]/div[1]/div[1]/div[2]/div[1]/app-select-criteria[1]/p-dialog[1]/div[1]/div[2]/div[1]/div[2]/div[4]/input[1]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Year(s)']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Active Problem List Status ALL Definition')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-angle-right']")).click();
		WebElement chkbox8 = driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
		Actions actions8 = new Actions(driver);
		actions8.moveToElement(chkbox8);
		actions8.perform();
		Thread.sleep(2000);
		//Click on Save	
		driver.findElement(By.cssSelector("p-button[title='Save'] span[class='ui-button-text ui-clickable']")).click();
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
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[15]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[16]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[18]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[19]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
		Thread.sleep(1000);
		//Add
		WebElement element = driver.findElement(By.xpath("(//span[normalize-space()='Add'])[1]")); 
		JavascriptExecutor js = (JavascriptExecutor)driver;   
		js.executeScript("arguments[0].click();", element);
		//scroll down to reach - AddCriteria Set
		WebElement chkbox9 = driver.findElement(By.xpath("//span[contains(text(),'Add Criteria Set')]"));
		Actions actions9 = new Actions(driver);
		actions9.moveToElement(chkbox9);
		actions9.perform();
		Thread.sleep(1000);
		//Click on Add Criteria Set
		WebElement element1 = driver.findElement(By.xpath("(//span[normalize-space()='Add Criteria Set'])[1]"));    
		JavascriptExecutor js1 = (JavascriptExecutor)driver;   
		js1.executeScript("arguments[0].click();", element1);
		Thread.sleep(1000);
		WebElement chkbox10 = driver.findElement(By.cssSelector("div[class='col-sm-4 col-md-4 col-lg-4 ui-grid-col-4 align-left'] b[class='textcolor']"));
		Actions actions10 = new Actions(driver);
		actions10.moveToElement(chkbox10);
		actions10.perform();
		//Next to Advance
		JavascriptExecutor js2 = (JavascriptExecutor)driver;   
		js2.executeScript("window.scrollBy(0,350)","");
		//Dynamic wait;
//		driver.findElement(By.xpath("//span[contains(text(),'Next to advance')]")).click();
//		driver.findElement(By.xpath("//p-button[@label='Next to advance']")).click();
		WebElement ele2 = driver.findElement(By.xpath("(//span[normalize-space()='Next to advance'])[1]"));
		JavascriptExecutor js4 = (JavascriptExecutor)driver;   
		js4.executeScript("arguments[0].click();", ele2);
		//driver.findElement(By.xpath("
		Thread.sleep(1000);
		//Dynamic wait;
		//Build Definition
		driver.findElement(By.xpath("//button[@title='Click here to build definition']")).click();
		Thread.sleep(1000);
		//Save As Draft & Next
		JavascriptExecutor js3 = (JavascriptExecutor)driver;   
		js3.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable'][normalize-space()='Save As Draft & Next'])[2]")).click();
//		Execute the cohortbuilder
		JavascriptExecutor js14 = (JavascriptExecutor)driver;   
		js14.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("//span[contains(text(),'Execute')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();







	}


}
