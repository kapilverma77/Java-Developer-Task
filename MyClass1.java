/* Ques 1 
    Take an input roman no from user & convert it into its corresponding numeric value. 
    Eg. Input: X
        Output: 10
        Input: IX
        Output: 9
*/
import java.util.*;
public class MyClass1 {
    public static int romanToInt(String s)
    {
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int sum = 0;
        for(int i=0;i<n-1;i++)
        {
            if(mp.get(s.charAt(i)) >= mp.get(s.charAt(i+1)))
            {
                sum += mp.get(s.charAt(i));
            }
            else
            {
               sum  -= mp.get(s.charAt(i));
            }
        }
        sum += mp.get(s.charAt(n-1));
        return sum;
    }
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your string : ");
      String s = sc.nextLine();
      int val = romanToInt(s);
      System.out.println("Integer value of string " + s + " is = " + val);
    }
}
