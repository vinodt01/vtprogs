public class fizzbuzz
{
public static void main(String args[])
{
 fizfunc(10);

}


public static void fizfunc(int n)
{
for(int i=0 ; i< n ; i++)
{
if(i % 3==0)
{
System.out.println("fizz\n");
}
else if(i % 5 == 0)
{
System.out.println("buzz\n");
}
else if(( i % 3 == 0)&&(i % 5 == 0))
{

System.out.println("fizzbuzz\n");
}
else
{
System.out.println(i+"\n");
}
}
}
}



