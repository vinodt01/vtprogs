// Program that returns a given String is Palindrome or Not
import java.util.*;
public class palindrome
{
public static void main(String args[])
{
 System.out.println(palindrome("abc"));

}

// Method palindrome
public static String palindrome(String a)
{
String rev="";
for(int i=a.length()-1;i>=0;i--)
{
rev+=a.charAt(i);
}
if(a.equalsIgnoreCase(rev))
{
return "It is a palindrome";
}
else
{
return "It is not a palindrome";
}
}

}