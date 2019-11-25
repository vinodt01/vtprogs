public class reverseint
{
public static void main(String args[])
{
 System.out.println(intreverse(-512));

}

public static int intreverse(int a)
{
if(a>0)
{
String num=String.valueOf(a);
String rev="";
for(int i=num.length()-1;i>=0;i--)
{
rev+=num.charAt(i);
}
return Integer.parseInt(rev);
}
else
{
a=a*-1 ;
String number=String.valueOf(a);
String reverse="";
for(int i=number.length()-1;i>=0;i--)
{
reverse+=number.charAt(i);
}
return Integer.parseInt(reverse) * -1;
}
}
}