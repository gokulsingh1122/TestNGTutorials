package test;

import org.testng.annotations.Test;

public class basics3 {
	
	@Test
	public void WebLoginCarLoan() {
	
		System.out.println("Web Login Car");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan() {
		
		System.out.println("Mobile Login Car");
	}
	
	@Test
	public void ApiLoginCarLoan() {
		
		System.out.println("Api Login Car");
	}
	
	
	

}
