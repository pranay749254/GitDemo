package tcs.com.Mavenjava;

import org.testng.annotations.Test;

public class Day1Test {

	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void notToExecute() {
		System.out.println("It won't execute");
	}
}
