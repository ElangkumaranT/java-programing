import java.util.*;
interface sample
{
public void deposit();
public void withdraw();
}
class inter implements sample
{
public String name;
public int ano;
float dept,bal,withd;
Scanner a = new Scanner(System.in);
public void getdata()
{

System.out.println("enter account holder name");
name = a.nextLine();
System.out.println("enter a account no");
ano = a.nextInt();
System.out.println("enter a blance amount");
bal = a.nextFloat();
}
public void deposit()
{
Scanner a = new Scanner(System.in);
System.out.println("enter the deposit amount");
dept = a.nextFloat();
}
public void withdraw()
{
System.out.println("enter the withdraw amount");
withd = a.nextFloat();
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