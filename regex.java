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
 public static void main(String[] args)
 {
  nameCheck();
 }
}
