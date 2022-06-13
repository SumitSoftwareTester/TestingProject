package com.hrms.libray;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;
//import org.openqa.selenium.chrome.ChromeDriver;
public class General  extends Global{
	
	//here i have to define all the method for program to use 

	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(ur);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		
		Log.info("Application Opened");
		
	}
	
	public void Login()
	{
		driver.findElement(By.name(txt_un)).sendKeys(un);
		driver.findElement(By.name(txt_up)).sendKeys(up);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login part done");
		Reporter.log("Login part done");
		Log.info("Login part done");
		
	}
	
	public void Logout()
	{
		driver.findElement(By.xpath(x_log)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.findElement(By.xpath(btn_log)).click();
		System.out.println("Logout Part done");
		Reporter.log("Logout part done");
		Log.info("Logout part done");
	}
	
	public void close_browser()
	{
		driver.close();
		System.out.println("Browser Closed");
		Reporter.log("Browser Closed");
		Log.info("Browser Closed");
	}
	
//	public void frame_entry()
//	{
//		driver.switchTo().frame("")
//	}
	
	public void Add_Employee()
	{
		
		driver.findElement(By.linkText(btn_pim)).click();
		driver.findElement(By.linkText(btn_Emp)).click();
		System.out.println("Click on the ADD empoyee ");
		driver.findElement(By.name(btn_add)).click();
		driver.findElement(By.name(firs_name)).sendKeys(fr_na);
		driver.findElement(By.name(las_name)).sendKeys(ls_na);
		driver.findElement(By.xpath(btn_save)).click();
		System.out.println("Employee adding has been done");
		Reporter.log("Employee adding has been done");
		Log.info("Employee adding has been done");
	}
	
	
	public void edit_employee()
	{
		driver.findElement(By.linkText(txt_pim)).click();
		System.out.println("CLick on empolyee name");
		driver.findElement(By.xpath(link_txt)).click();
		
		driver.findElement(By.id(btn_edit)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.findElement(By.name(fn_name)).clear();
		driver.findElement(By.name(ln_name)).clear();
		System.out.println("first_name &last name has been deleted");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(By.name(fn_name)).sendKeys(fna);
		driver.findElement(By.name(ln_name)).sendKeys(lna);
		System.out.println("firstname and lastname has been updated");
		driver.findElement(By.id(btn_sav)).click();
		System.out.println("Data has been update");
		Reporter.log("Data has been update");
		Log.info("Data has been update");
	}
	
	public void Delete_emp()
	{
		driver.findElement(By.linkText(txt_link)).click();
		driver.findElement(By.id(emp_id)).sendKeys(empid_det);
		driver.findElement(By.name(ch_box)).click();
		driver.findElement(By.name(bt_del)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(By.id(btn_dele)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		System.out.println("Delete has been deleted");
		Reporter.log("Delete has been deleted");
		Log.info("Delete has been deleted");
	}
	
	public void check_employee()
	{
		driver.findElement(By.linkText(tt_lin)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		for (int i=1;i<=20;i=i+2)
			
		{  
			//*[@id="ohrmList_chkSelectRecord_54"]
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
			driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_"+i+"\"]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		}
	}
	
}
