/*
   Ques 2
   A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
   it reads the same forward and backward. Alphanumeric characters include letters and numbers.
   Given a string s, return true if it is a palindrome, or false otherwise.
   Given Input : s = "A man, a plan, a canal: Panama"
   Output: true
   Explanation: "amanaplanacanalpanama" is a palindrome
*/
import java.util.*;
public class MyClass2 {

    public static boolean isPalindrome(String str) 
    {

        StringBuilder s1 = new StringBuilder();

        for(char ch : str.toCharArray()) {

            if(Character.isLetterOrDigit(ch))
            {
                s1.append(Character.toLowerCase(ch));
            }
        }
        str = s1.toString();
        
        for(int i= 0; i < str.length() / 2; i++) 
        {
            int g = str.length()-1-i;
            if(str.charAt(i) != str.charAt(g)) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your string : ");
      String s = sc.nextLine();
      boolean k = isPalindrome(s);
      System.out.println(k);
    }
}