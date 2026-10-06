import java.util.*;
class Example10
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int product=1;
System.out.println("Enter Number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
product=product*i;
}
System.out.println("product of  numbers:"+product);
}
}


