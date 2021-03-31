import java.util.regex.Pattern;
import java.util.*;

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

 // USE CASE 2 - Validity Check of Lastname
 // Lastname User Input
 static String getLastName()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Lastname : ");
  String lname = sc.nextLine();
  return lname;
 }

 // Common Check for Firstname and Lastname
 static void nameCheck()
 {
  String fname = getFirstName();
  String lname = getLastName();
  boolean fnameCheck = Pattern.matches("^[A-Z][a-z]{2,}",fname);
  boolean lnameCheck = Pattern.matches("^[A-Z][a-z]{2,}",lname);
  if(fnameCheck && lnameCheck)
  {
   System.out.println("Correct");
  }
  else
  {
   System.out.println("Invalid Firstname/Lastname - Enter a name starting with Cap and has minimum 3 characters");
  }
 }

 //USE CASE 3 - Vailidity Check for Email
 //Email User Input
 static String getEmail()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Email : ");
  String gmail = sc.nextLine();
  return gmail;
 }

 //Check for Email
 static void emailCheck()
 {
  String gmail = getEmail();
  boolean mailCheck = Pattern.matches("((^[a-z]{1,}((([-]|[.]|[+])[0-9]{1,})|[0-9]{1,}))|(^[a-z]{1,}))[@](([a-z]{2,}[.][a-z]{2,})|([a-z]{2,}[.][a-z]{2,}[.][a-z]{2,})|([0-1][.][a-z]{2,}))",gmail);
  if(mailCheck)
  {
   System.out.println("Valid Email");
  }
  else
  {
   System.out.println("Invalid Email");
  }
 }

 static String getMobileNo()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter MobileNo : ");
  String mobileNo = sc.nextLine();
  return mobileNo;
 }

 static void mobileNoCheck()
 {
  String mobileNo = getMobileNo();
  boolean mobNoCheck = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",mobileNo);
  if(mobNoCheck)
  {
   System.out.println("Valid Mobile Number");
  }
  else
  {
   System.out.println("Invalid Mobile Number");
  }
 }

 public static void main(String[] args)
 {
  nameCheck();
  emailCheck();
  mobileNoCheck();
 }
}
