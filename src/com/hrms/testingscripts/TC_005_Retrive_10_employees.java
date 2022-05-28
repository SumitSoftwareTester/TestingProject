package com.hrms.testingscripts;

import com.hrms.libray.General;

public class TC_005_Retrive_10_employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		General ob=new General();
		ob.openbrowser();
		ob.Login();
		ob.check_employee();
		ob.Logout();
		ob.close_browser();

	}

}
