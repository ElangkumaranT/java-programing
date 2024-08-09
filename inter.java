import java.util.*;
public interface sample
{
public void deposit();
public void withdraw();
}
public class inter implement sample
{
void getdata()
{
Scanner a = new Scanner(System.in);
System.out.println("enter account holder name");
String name = a.nextLine();
System.out.println("enter a account no");
int ano = o.nextInt();
System.out.println("enter a blance amount");
float bal = a.nextFloat();
}
public void deposit()
{
System.out.println("enter the deposit amount");
float dept = a.nextFloat();
}
public void withdraw()
{
System.out.println("enter the withdraw amount");
float withd = a.nextFloat();
}
void display()
{
System.out.println("NAME :" + name);
System.out.println("ACCNO :" + ano);
System.out.println("BALANCE :" + bal);
bal = bal + dept;
System.out.println("AFTER DEPOSITE BALANCE :" + bal);
bal = bal - withd;
System.out.println("AFTER WITHDRAW BLANCE :" + bal);
}
}
public class demo
{
public static void main(String arg[])
{
inter obj = new inter();
obj.getdata();
obj.deposit();
obj.withdraw();
obj.display();
}
}