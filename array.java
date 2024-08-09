import java.util.Scanner;
class array{
public static void main(String args[]){
int i,fact=1;
Scanner a = new Scanner(System.in);
System.out.print("enter a n value");
int n = a.nextInt();
int mark[] = new int[n];
for(i=1;i<=mark.length ;i++)
{
fact = fact * i;
}
System.out.print(fact);
}
}