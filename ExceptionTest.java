import org.junit.Assert;
import org.junit.Test;

//USE CSAE 12 - Custom Exception Test
public class ExceptionTest
{
   //Test for Firstname Exception
	@Test
   public void fnExceptionCheck()
	{
		Regex ur = new Regex();
		String check = ur.fnameExceptionCheck();
	   Assert.assertEquals(check, "INVALID");
   }

   //Test for Lastname Exception
   @Test
   public void lnExcepyionCheck()
   {
      Regex ur = new Regex();
      String check = ur.lnameExceptionCheck();
      Assert.assertEquals(check, "INVALID");
   }

   //Test for Email Exception
   @Test
   public void eExceptionCheck()
   {
      Regex ur = new Regex();
      String check = ur.emailExceptionCheck();
      Assert.assertEquals(check, "INVALID");
   }

   //Test for MobileNo Exception
   @Test
   public void mnExceptionCheck()
   {
      Regex ur = new Regex();
      String check = ur.mobileNoExceptionCheck();
      Assert.assertEquals(check, "INVALID");
   }

   //Test for Password Exception
   @Test
   public void pExceptionCheck()
   {
      Regex ur = new Regex();
      String check = ur.passwordExceptionCheck();
      Assert.assertEquals(check, "INVALID");
   }
}
