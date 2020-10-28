package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTest {

	@Test
	public void test1() {
		System.out.println("test1");
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		assertTrue(true);
	}	
	
	@Test
	public void test3() {
		System.out.println("test3");
		assertTrue(true);
	}
	
	// Before Test - run before all test
	@Before
	public void beforeTest() {
		System.out.println("Before");
		assertTrue(true);
	}
	
	// After Test - run after all test
	@After
	public void afterTest() {
		System.out.println("After");
		assertTrue(true);
	}	
	
	// Before Class Test - run once before all test
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before Class");
		assertTrue(true);
	}
	
	// After Class Test - run after all test
	@AfterClass
	public static void afterClassTest() {
		System.out.println("After Class");
		assertTrue(true);
	}	
	
	
	
	
}
