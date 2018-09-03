import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int rr,tmp,s=0,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
tmp=n;
while(n>0)
{
rr=n%10;
s=(s*10)+rr;
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
