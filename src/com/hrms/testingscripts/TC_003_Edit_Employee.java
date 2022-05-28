package com.hrms.testingscripts;

import com.hrms.libray.General;

public class TC_003_Edit_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General ob=new General();
		ob.openbrowser();
		ob.Login();
		ob.edit_employee();
		ob.Logout();
		ob.close_browser();


	}

}
