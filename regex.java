import java.util.regex.Pattern;
import java.util.*;

public class regex
{
 // USE CASE 1 - Validity Check of  Firstname
 static String getFirstName()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Firstname : ");
  String fname = sc.nextLine();
  return fname;
 }
 static void firstNameCheck()
 {
  String fname = getFirstName();
  boolean nameCheck = Pattern.matches("^[A-Z][a-z]{2,}",fname);
  if(nameCheck)
  {
   System.out.println("Correct");
  }
  else
  {
   System.out.println("Invalid Firstname - Enter a name starting with Cap and has minimum 3 characters");
  }
 }
 public static void main(String[] args)
 {
  firstNameCheck();
 }
}
