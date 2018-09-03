public class Odd
{
public static void main(String args[])
{
int a,b,i;
Scanner s=new Scanner(System.in);
System.out.println("first number:");
 a=s.nextInt();
System.out.println("second number:");
 b=s.nextInt();
for(i=a;i<b;i++)
{
if(a%2!=0)
{
System.out.println(a);
}
a=a+1;
}
}
}
