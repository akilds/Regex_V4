package UserRegistration;

import java.util.Arrays;
import org.junit.Assert;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class ParaEmailTest {

	String email;
	boolean check;
	
    public UREmailTest(String email, boolean check)
	{
	 this.email = email;
	 this.check = check;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
		                                     {"abc-100@yahoo.com",true},
		                                     {"abc.100@yahoo.com",true},
		                                     {"abc111@abc.com",true},
		                                     {"abc-100@abc.net",true},
		                                     {"abc.100@abc.com.au",true},
		                                     {"abc@1.com",true},
		                                     {"abc@gmail.com.com",true},
		                                     {"abc+100@gmail.com",true},
		                                     {"abc",false},
		                                     {"abc@.com.my",false},
		                                     {"abc123@gmail.a",false},
		                                     {"abc123@.com",false},
		                                     {"abc123@.com.com",false},
		                                     {".abc@abc.com",false},
		                                     {"abc()*@gmail.com",false},
		                                     {"abc..2002@gmail.com",false},
		                                     {"abc.@gmail.com",false},
		                                     {"abc@abc@gmail.com",false},
		                                     {"abc@gmail.com.1a",false},
		                                     {"abc@gmail.com.aa.au",false}});
	}
	
	@Test
	public void testMail()
	{
		regex ur = new regex();
		boolean mCheck = ur.mailCheck(email);
		Assert.assertEquals(check,mCheck);
	}
}
