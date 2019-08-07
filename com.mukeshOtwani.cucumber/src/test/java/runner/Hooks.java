package runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before(order=1)
	public void init() {
		System.out.println("Before hook invoked");
	}
	
	@After(order=2)
	public void cleanup() {
		System.out.println("After hook invoked");
	}

}