import java.util.Scanner;
class elango
{
public static void main(String ards[]){
stack s1 = new stack();
int s[] = new int[10];
Scanner a = new Scanner(System.in);
int ch;
do
{
System.out.println("1.push \n 2.pop \n3.display");
//Scanner a = new Scanner(System.in); 
ch = a.nextInt();
switch(ch){
case 1:
    System.out.println("enter a insert value");
    int item = a.nextInt();
    s1.push(item);
    break;
case 2:
    System.out.println(s1.pop());
    break;
case 3:
    int i;
    for(i=0;i<s.length;i++)
    System.out.println(s[i]);
    int cho = ch;
    break;
   }
  
}while(ch<4);
  }
 }