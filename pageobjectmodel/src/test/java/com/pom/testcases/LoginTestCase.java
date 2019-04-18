package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.base.Base;

public class LoginTestCase extends Base{
	
	@Test
	public void login() {
		topNavigationBar.clickOnLogin();
		
	}

}
