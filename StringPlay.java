// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************
public class StringPlay
{
 public static void main (String[] args)
 {
 String school = "Harvard";
 
 // part (a)
 int stringLen = school.length();
 String upper, changeChar, combine;
 String city = "Boston, MA";

  // part (b)
 System.out.println (school + " contains " + stringLen + " characters.");
 upper = school.toUpperCase(); // part (c)
//display upper to see if it’s correct.
 changeChar = upper.replace("A", "*") ; 
 // part (d)
//display changeChar to see if it’s correct.
 combine = school + " " + city; // part (e)
 System.out.println ("The final string is " + combine);
 
 }
}