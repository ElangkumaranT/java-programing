import java.util.Scanner;
public class exam
{
static int fact(int n)
{
if(n==0)
return 1;
else 
return n*fact(n-1);
}
public static void main(String ard[])
{
Scanner a = new Scanner(System.in);
int n = a.nextInt();
System.out.println(fact(n));
}
}