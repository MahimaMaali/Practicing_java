import java.util.*;
class Example7
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int n=sc.nextInt();
int rev=0;
int k=n;
while(n!=0)
{
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(k==rev)
{
System.out.println("palindrome");
}
else{
System.out.println(" Not palindrome");
}
}
}
