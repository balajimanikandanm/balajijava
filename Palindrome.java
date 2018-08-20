import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int r,tmp,s=0,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
tmp=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(tmp==s)
{
System.out.println("yes");
}
else
{
System.out.println("No");
}
}
}
