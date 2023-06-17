package tests;

import base.Base;

public class Verify_Employee_Login_Functionality extends Base {

	public static void main(String[] args) {
		/*
		 * Step 1: Visit it.mocrotechlimited.com
		 * Step 2: Click to login menu 
		 * Step 3: write employee Log-in ID 
		 * Step 4: Write Pass word 
		 * Step 5: Click on Login Button 
		 * Step 6: Verify employee Home Page title
		 * 
		 */
		setup();
		getURL();
		click();
		sendkeys();
		//li/a[@href='elogin.php']
		//a[text()="LOG IN"]
		//homeblack

	}

}
