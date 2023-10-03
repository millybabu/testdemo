package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test1 {
	
	static ExtentReports report;
	SoftAssert softAssert=new SoftAssert();
		
	@BeforeClass
	public static void startTest() {
		report=new ExtentReports();
		ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html");
		report.attachReporter(reporter);
		
	}
	
	
	@Test
	public void sum() {
		System.out.println("sum");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
		
	}
	
	
	@Test
	public void sub() {
		System.out.println("SUB");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void mul() {
		System.out.println("Multiply");
		int a=10;
		int b=20;
		softAssert.assertEquals(100, a*b);
		System.out.println("print after assertion check- multiplication");
		softAssert.assertAll();
	}
	@Test
	public void div() {
		System.out.println("Division");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}
	@AfterClass
	public static void finishTest() {
		System.out.println("Done");
		
	}

}
