package com.selenium.TestNGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.TestNGTest.utils.ExtentManager;

public class TestFirst {
	
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = null;
	
	@Test
	public void testA() {
		
		test = rep.startTest("TestFirst");
		
		System.out.println("Testing A");
		
		test.log(LogStatus.INFO, "Started just");
		test.log(LogStatus.INFO, "Second Step");
		test.log(LogStatus.PASS, "TestCase Passed");
	}
	
	@AfterMethod
	public void flustTestA() {
		
		System.out.println("flushing test A");
		
		rep.endTest(test);
		rep.flush();
	}

}
