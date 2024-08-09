import java.util.Scanner;
class student{
String name;
int rollno;
int mark[ ] = new int[3];
int i;
public void getdata()
{
System.out.println("\t\t\t BASIC CLASS");
Scanner em = new Scanner(System.in);
System.out.println("enter your namer:");
name = em.next();
System.out.println("enter rollno:");
rollno = em.nextInt();
System.out.println("enter the three marks:");
for(i=0;i<mark.length;i++)
{
mark[i]=em.nextInt();
}
}
}
class sports extends student{
int smark,total = 0,avg;
Scanner em1 = new Scanner(System.in);
void getmarks()
{
System.out.println("\t\t\t DRIVED CLASS");
System.out.println("enter the sports mark");
smark = em1.nextInt();
}
void display()
{
System.out.println("\nNAME :" + name);
for(i=0;i<mark.length;i++)
{
total = total + mark[i];
}
total = total +smark;
avg = total/4;
System.out.println("ROLLNO :" + rollno);
System.out.println("TOTAL  :" + total);
System.out.println("AVERAGE:" + avg);
}
}
public class inhertance{
public static void main(String arg[])
{
sports obj1 = new sports();
obj1.getdata();
obj1.getmarks();
obj1.display(); 
}
} 
