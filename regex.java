import java.util.regex.Pattern;
import java.util.*;

//Exception Class
class UserRegistrationException extends Exception
{
	UserRegistrationException(String s)
	{
		super(s);
	}
}

public class regex
{
 // USE CASE 1 - Validity Check of  Firstname
 // Firstname User Input
 static String getFirstName()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Firstname : ");
  String fname = sc.nextLine();
  return fname;
 }
 
 //Check for Firstname 
 static boolean fnameCheck()
 {
  String fname = getFirstName();
  boolean fnameCheck = Pattern.matches("^[A-Z][a-z]{2,}",fname);
  return fnameCheck;
 }

 // USE CASE 2 - Validity Check of Lastname
 // Lastname User Input
 static String getLastName()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Lastname : ");
  String lname = sc.nextLine();
  return lname;
 }

 // Check for Lastname
 static boolean lnameCheck()
 {
	 String lname = getLastName();
	 boolean lnameCheck = Pattern.matches("^[A-Z][a-z]{2,}",lname);
	 return lnameCheck; 
 }

 //USE CASE 3, 9 - Vailidity Check for Email
 //Email User Input
 static String getEmail()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Email : ");
  String gmail = sc.nextLine();
  return gmail;
 }

 //Check for Email
 static boolean emailCheck()
 {
  String gmail = getEmail();
  boolean mailCheck = Pattern.matches("((^[a-z]{1,}((([-]|[.]|[+])[0-9]{1,})|[0-9]{1,}))|(^[a-z]{1,}))[@](([a-z]{2,}[.][a-z]{2,})|([a-z]{2,}[.][a-z]{2,}[.][a-z]{2,})|([0-1][.][a-z]{2,}))",gmail);
  return mailCheck;
 }

 //Check for Parameterized Email 
 static boolean mailCheck(String gmail)
 {
  boolean mailCheck = Pattern.matches("((^[a-z]{1,}((([-]|[.]|[+])[0-9]{1,})|[0-9]{1,}))|(^[a-z]{1,}))[@](([a-z]{2,}[.][a-z]{2,})|([a-z]{2,}[.][a-z]{2,}[.][a-z]{2,})|([0-1][.][a-z]{2,}))",gmail);
  return mailCheck;
 }

 //USE CASE 4 - Validity Check for Mobile Number
 //Moblie Number User Input
 static String getMobileNo()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter MobileNo : ");
  String mobileNo = sc.nextLine();
  return mobileNo;
 }

 //Check for Mobile Number
 static boolean mobileNoCheck()
 {
  String mobileNo = getMobileNo();
  boolean mobNoCheck = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",mobileNo);
  return mobNoCheck;
 }

 //USE CASE 5, 6, 7, 8 - Validity Check for Password
 //PAssword User Input
 static String getPassword()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Password : ");
  String password = sc.nextLine();
  return password;
 }

 //Check for Password
 static boolean passwordCheck()
 {
  String password = getPassword();
  boolean passCheck = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%]).{8,}",password);
  return passCheck;
 }

 //USE CASE 12 - Custom Exceptions
 //Exception Check for Firstname
 public String fnameCheck1() throws UserRegistrationException
 {

   String fname = getFirstName();
   boolean fnameCheck1 = Pattern.matches("^[A-Z][a-z]{2,}",fname);
   if(fnameCheck1)
   {
	   return "VALID";
   }
   else
   {
	   throw new UserRegistrationException("INVALID");
   }
 }

 public String fnameExceptionCheck()
 {
	 try 
	 {
	  String s = fnameCheck1();
	  return s;
	 }
	 catch(Exception e)
	 {
		 return "INVALID";
	 }
 }

 //Exception Check for Lastname
 public String lnameCheck1() throws UserRegistrationException
 {

   String lname = getLastName();
   boolean lnameCheck1 = Pattern.matches("^[A-Z][a-z]{2,}",lname);
   if(lnameCheck1)
   {
	   return "VALID";
   }
   else
   {
	   throw new UserRegistrationException("INVALID");
   }
 }

 public String lnameExceptionCheck()
 {
	 try
	 {
	  String s = lnameCheck1();
	  return s;
	 }
	 catch(Exception e)
	 {
		 return "INVALID";
	 }
 }

 //Exception Check for Email
 public String emailCheck1() throws UserRegistrationException
 {

   String email = getEmail();
   boolean mailCheck = Pattern.matches("^[A-Z][a-z]{2,}",email);
   if(mailCheck)
   {
	   return "VALID";
   }
   else
   {
	   throw new UserRegistrationException("INVALID");
   }
 }

 public String emailExceptionCheck()
 {
	 try
	 {
	  String s = emailCheck1();
	  return s;
	 }
	 catch(Exception e)
	 {
		 return "INVALID";
	 }
 }

 //Exception Check for MobileNo
 public String mobileNoCheck1() throws UserRegistrationException
 {
   String mobileNo = getMobileNo();
   boolean mobNoCheck = Pattern.matches("^[A-Z][a-z]{2,}",mobileNo);
   if(mobNoCheck)
   {
	   return "VALID";
   }
   else
   {
	   throw new UserRegistrationException("INVALID");
   }
 }

 public String mobileNoExceptionCheck()
 {
	 try
	 {
	  String s = mobileNoCheck1();
	  return s;
	 }
	 catch(Exception e)
	 {
		 return "INVALID";
	 }
 }

 //Exception Check for Password
 public String passwordCheck1() throws UserRegistrationException
 {

   String password = getPassword();
   boolean passwordCheck = Pattern.matches("^[A-Z][a-z]{2,}",password);
   if(passwordCheck)
   {
	   return "VALID";
   }
   else
   {
	   throw new UserRegistrationException("INVALID");
   }
 }

 public String passwordExceptionCheck()
 {
	 try
	 {
	  String s = passwordCheck1();
	  return s;
	 }
	 catch(Exception e)
	 {
		 return "INVALID";
	 }
 }

}


