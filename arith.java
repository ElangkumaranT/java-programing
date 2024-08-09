import java.util.Scanner;
class add
{
int a,b,c;
void public getvalue(int i,int j)
{
i=a;
j=b;
result(i,j);
}
void result(int i,int j)
{
int d;
System.out.println(i);
d = i + j;
System.out.println(d);
}
}
class sub
{
int a,b,c;
int getvaluea()
{
Scanner get = new Scanner(System.in);
int a = get.nextInt();
int b = get.nextInt();
return a;
}
void resulta()
{
c = a - b;
System.out.println(a);
}
}
class mul
{
int a,b,c;
void getvalueb()
{
Scanner get = new Scanner(System.in);
int a = get.nextInt();
int b = get.nextInt();
}
void resultb()
{
c = a*b;
System.out.println(c);
}
}
class div
{
int a,b,c;
void getvaluec()
{
Scanner get = new Scanner(System.in);
int a = get.nextInt();
int b = get.nextInt();
}
void resultc()
{
c = a/b;
System.out.println(c);
}
}
class arith{
public static void main(String argu[]){
System.out.println("1.add \n 2.sub \n 3.mul \n4.div");
System.out.println("enter your choice");
Scanner c = new Scanner(System.in);
int choice = c.nextInt();
//do{
switch(choice){
case 1:
   add obj1 = new add();
   obj1.getvalue(2,5);
   
   
   break;
case 2:
   sub obj2 = new sub();
   obj2.getvaluea();
   obj2.resulta();
   
   break;
case 3:
   mul obj3 = new mul();
   obj3.getvalueb();
   obj3.resultb();
  
   break;
case 4:
   div obj4 = new div();
   obj4.getvaluec();
   obj4.resultc();
   
   break;
default:
       break; 
  
}
//System.out.println("do you wanted use this");
//Scanner e = new Scanner(System.in);
//String as = e.nextLine();
//}while(as=="yes");
}
}
