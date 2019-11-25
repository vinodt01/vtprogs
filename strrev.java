import java.util.*;
public class strrev
{
public static void main(String args[])
{
 System.out.println(stringreverse("qwe").toString());

}

public static String stringreverse(String a)
{
String rev="";
for(int i=a.length()-1;i>=0;i--)
{
rev+=a.charAt(i);
}
return rev;
}

}