package test;

import org.testng.annotations.Test;

public class basics4 {
	
	@Test
	public void WebLoginHomeLoan() {
	
		System.out.println("Web Login HomeLoan");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan() {
		
		System.out.println("Mobile Login HomeLoan");
	}
	
	@Test
	public void ApiLoginHomeLoan() {
		
		System.out.println("Api Login HomeLoan");
	}

}
