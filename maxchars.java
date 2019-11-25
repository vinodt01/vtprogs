// Program that returns Maximum characters in a String
public class maxchars
{
public static void main(String args[])
{
System.out.println(maxchar("abbccc"));
}

public static char maxchar(String a)
{
int chars[] = new int[256];
int max=-1;
char res =' ';
for(int i= 0; i< a.length();i++)
{
chars[a.charAt(i)]++;
if(max<chars[a.charAt(i)])
{
max = chars[a.charAt(i)];
res = a.charAt(i);
}
}
return res;

} 


}