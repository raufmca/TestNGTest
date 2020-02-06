package com.selenium.TestNGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.TestNGTest.utils.ExtentManager;

public class TestSecond {
	
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = null;
	
	
	@Test
	public void testsecondA() {
		
		test = rep.startTest("TestSecond");
		test.log(LogStatus.INFO, "Step 1");
		test.log(LogStatus.INFO, "Step2");
		
		test.log(LogStatus.FAIL, "Test Failed" + test.addScreenCapture("c:\\Users\\310204413\\Downloads\\me.jpg"));
	}

	@AfterMethod
	public void closetest() {
		rep.endTest(test);
		rep.flush();
	}
}
