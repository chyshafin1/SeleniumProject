package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder1 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Testing Annotation");
	}
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suite Annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
	}
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Excute Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Excute Test2");
	}
	
	@Test(priority = 0)
	public void test3() {
		System.out.println("Excute Test3");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Testing Annotation");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suite Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Annotation");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation");
	}
	
	
	
}
