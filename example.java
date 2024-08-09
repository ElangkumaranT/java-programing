class employe{
public String name;
public int epid;
public double salary;
employe(String n,int eid,double s){
name = n;
epid = eid;
salary = s;
}
public void display()
{
System.out.println("name=" + name);
System.out.println("employe id=" + epid);
System.out.println("salary=" + salary);
}
}
class manager extends employe{
manager(String n,int eid,double s,double b)
{
name = n;
epid = eid;
salary = s;
double bones;
bones = b;
salary+=salary*bones/100;
}
public void display()
{
super.display();
}
}
public class example
{
public static void main(String ard[])
{
employe obj1 = new employe("elango", 10 ,1000.00);
manager obj2 = new manager("karthi",20,2000.00,10.0);
obj2.display();
}
}