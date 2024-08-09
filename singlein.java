import java.util.*;
class employee
{
String ename;
String eid;
float salary;
void getdata()
{
System.out.println("\t\t\t\tBASIC CLASS");
Scanner o = new Scanner(System.in);
System.out.println("enter employee name");
ename = o.nextLine();
System.out.println("enter a employee id");
eid = o.nextLine();
System.out.println("enter a basic salary");
salary = o.nextFloat();
}
}
class update extends employee
{
void display()
{
System.out.println("\t\t\t\t DRIVED CLASS");
Scanner o1 = new Scanner(System.in);
System.out.println("enter a increment salary % :"); 
float updatE =o1.nextFloat();
float s =salary+salary*(updatE / 100);

System.out.println("EMPLOYE NAME=" + ename);
System.out.println("EMPLOYE EID =" + eid);
System.out.println("OLD SALARY  =" + salary);
System.out.println("NEW SALARY  =" + s);
}
}
public class singlein
{
public static void main(String a[])
{
update obj = new update();
obj.getdata();
obj.display();
}
}



