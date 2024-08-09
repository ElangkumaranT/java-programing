class userthread implements Runnable
{
public userthread()
{
Thread t = new Thread(this,"user_thread");
System.out.println("user creat thread "+t);
t.start();
}
public void run()
{

for(int j=1;j<=10;j++)
{
if(j%2==0)
{
System.out.println("secount thread"+j+"is even");
//Thread.sleep(1000);
}
}
}
}
public class threada
{
public static void main(String arg[])
{
userthread ob = new userthread();
for(int i=1;i<=10;i++)
{
if(i%2==0)
{
//Thread.sleep(1000);
}
else
{
System.out.println("first thread "+i+"is odd");
}
}
}
}
