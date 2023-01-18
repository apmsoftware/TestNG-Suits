package com.testng.suits;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void TC_1() {
		
		Reporter.log("Running TC 1 ");
	}
	
	
	@Test
	public void TC_2() {
		Reporter.log("Running TC 2 ");
	}
}
