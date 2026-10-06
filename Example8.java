import java.util.*;
class Example8
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
if(i%3==0)
{
sum=sum+i;
}
}
System.out.println("sum of number divisible by 3:"+sum);
}
}

