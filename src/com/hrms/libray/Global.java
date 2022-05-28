package com.hrms.libray;

import org.openqa.selenium.WebDriver;

public class Global  {

	
	//here the test data and the object i have to declareLogin 
	
	public WebDriver driver;
	//Login Part
	
	public String ur= "https://opensource-demo.orangehrmlive.com/";
	public String un= "Admin";
	public String up="admin123";
	
	public String txt_un="txtUsername";
	public String txt_up="txtPassword";
	public String btn_login="Submit";  //login part only
	

	//Logout part
	
	public String x_log="//*[@id=\"welcome\"]";
	public String btn_log= "//*[@id=\"welcome-menu\"]/ul/li[3]/a";
	
	
	// Add_Empolyee
	
	public String  btn_pim= "PIM";
	
	public String btn_Emp= "Employee List";
	public String btn_add="btnAdd";
	public String fr_na="Ramcharn";
	public String ls_na="Junior NTR";
	public String firs_name= "firstName";
	public String las_name= "lastName";
	
	public String btn_save= "//input[@value='Save']";
	
	
	//Edit Employee
	
	public String txt_pim= "PIM";
	public String link_txt="//*[@id=\"resultTable\"]/tbody/tr[4]/td[3]/a" ; //linktext
	public String btn_edit="btnSave";
	public String fn_name= "personal[txtEmpFirstName]";
	public String ln_name= "personal[txtEmpLastName]";
	public String fna="Junior";
	public String lna="Sumit";
	public String btn_sav="btnSave";
	
	//delete Employee
	public String txt_link="PIM";
	public String empid_det="0272";
	public String emp_id="empsearch_id";
	public String emp_search="";
	public String ch_box="chkSelectRow[]";
	public String bt_del="btnDelete";
	public String btn_dele="dialogDeleteBtn";
	
	//select the 10 employee
	public String tt_lin="PIM";
	 
	
	
	

}

