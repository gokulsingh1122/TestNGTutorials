package test;

import org.testng.annotations.Test;

public class basics {

	@Test(groups={"Smoke"})
//	(enabled=false)
	public void first(){
		
		System.out.println("Hello");
	}
	
	@Test
	public void second() {
		System.out.println("bye");	
	}

}
