package com.hrms.testingscripts;

import com.hrms.libray.General;

public class TC_002_Add_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General ob=new General();
		ob.openbrowser();
		ob.Login();
		ob.Add_Employee();
		ob.Logout();
		ob.close_browser();

	}

}
