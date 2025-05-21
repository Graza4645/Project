package Script_2;

import org.testng.annotations.Test;

public class Script_2 {
	@Test(groups = "smoke")
	public void test1() {
		  System.out.println("Hi i am smoke test case from Script-2 Package");
	}
	
	
	@Test(groups = "regression")
	public void test2() {
		  System.out.println("Hi i am regression test case from Script-2 Package");
	}
}
