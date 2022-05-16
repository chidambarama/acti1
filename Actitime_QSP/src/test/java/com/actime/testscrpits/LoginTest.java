package com.actime.testscrpits;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actime.pages.LoginPage;
import com.actitime.commonutils.WebDriverUtils;
import com.actitime.configuration.CommonSetup;


public class LoginTest extends CommonSetup
{

	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		
		driver.get(WebDriverUtils.getDataProperties("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.loginOperation(WebDriverUtils.getDataProperties("username"), WebDriverUtils.getDataProperties("password"));
		
		
		if(driver.getTitle().contains("actiTIME"))
		{
			Assert.assertTrue(true);

		}

		else
		{
			Assert.assertTrue(false);
			System.out.println("fail");
		}
	}

		
}
