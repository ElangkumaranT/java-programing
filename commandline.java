public class commandline
{
public static void main(String args[])
{
for(int i = 0;i<args.length;i++)
{
 for(int j = 1;j<arge.length;j++)
{
if(args[i] > args[j])
{
String temp = args[i];
args[i] = args[j];
args[j] = temp; 
}
}
}
for(i=0;i<args.length;i++)
{
System.out.println(args[i]);
}
}
}