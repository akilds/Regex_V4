import java.util.regex.Pattern;
import java.util.*;

public class Regex
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

}


