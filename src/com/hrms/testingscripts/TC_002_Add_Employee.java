package com.hrms.testingscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.libray.General;

public class TC_002_Add_Employee {

	 
		// TODO Auto-generated method stub
		@Test
		public void tc_001()
		{
			DOMConfigurator.configure("log4j.xml");
		General ob=new General();
		ob.openbrowser();
		ob.Login();
		ob.Add_Employee();
		ob.Logout();
		ob.close_browser();

	}

}
