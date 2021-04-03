import org.junit.Assert;
import org.junit.Test;

//USE CASE 10 - Junit Test
public class MoodTest
{

	//Test for Firstname
	@Test
    public void fncheck()
	{
		regex ur = new regex();
		boolean check = ur.fnameCheck();
		if(check)//Check for Happy
		{
		 Assert.assertEquals(check,true);
		}
		else//Check for Sad
		{
		 Assert.assertEquals(check, false);
		}
    }
    
	//Test for Lastname
	@Test
    public void lncheck()
	{
		regex ur = new regex();
		boolean check = ur.lnameCheck();
		if(check)//check for Happy
		{
		 Assert.assertEquals(check,true);
		}
		else//Check for Sad
		{
	     Assert.assertEquals(check,false);
		}
    }

	//Test for Email
	@Test
    public void echeck()
	{
		regex ur = new regex();
		boolean check = ur.emailCheck();
		if(check)//check for Happy
		{
		 Assert.assertEquals(check,true);
		}
		else//Check for Sad
		{
	     Assert.assertEquals(check,false);
		}
    }

	//Test for MobileNo
	@Test
    public void mncheck()
	{
		regex ur = new regex();
		boolean check = ur.mobileNoCheck();
		if(check)//check for Happy
		{
		 Assert.assertEquals(check,true);
		}
		else//Check for Sad
		{
	     Assert.assertEquals(check,false);
		}
    }

	//Test for Password
	@Test
    public void pcheck()
	{
		regex ur = new regex();
		boolean check = ur.passwordCheck();
		if(check)//check for Happy
		{
		 Assert.assertEquals(check,true);
		}
		else//Check for Sad
		{
	     Assert.assertEquals(check,false);
		}
	}
}
