package Script_1;

import org.testng.annotations.Test;



public class Script_1 {

	@Test(groups = "smoke")
	public void test1() {
		  System.out.println("Hi i am smoke test case from Script-1 Package");
		  System.out.println("Hi i am smoke test case from Script-1 Package 00:27");
		  System.out.println("Hi i am smoke test case from Script-1 Package 00:31");
		  System.out.println("Hi i am smoke test case from Script-1 Package 00:38");
		  
		  
	}
	
	
	@Test(groups = "regression")
	public void test2() {
		  System.out.println("Hi i am regression test case from Script-1 Package");
		  System.out.println("Hi i am regression test case from Script-1 Package 00:27");
		  System.out.println("Hi i am regression test case from Script-1 Package 00:31");
		  System.out.println("Hi i am regression test case from Script-1 Package 00:38");
	}
	}

