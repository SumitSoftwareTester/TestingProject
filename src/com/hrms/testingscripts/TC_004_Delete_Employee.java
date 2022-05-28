package com.hrms.testingscripts;

import com.hrms.libray.General;

public class TC_004_Delete_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General ob=new General();
		ob.openbrowser();
		ob.Login();
		ob.Delete_emp();
		ob.Logout();
		ob.close_browser();


	}

}
