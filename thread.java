class user_Thread implements Runnable
{
public user_Thread()
{
Thread t = new Thread(this,"UserThread");
System.out.println("Details about user created thread :"+t);
t.start();
}
public void run()
{
try
{
for(int j=1;j<=30;j++)
{
if(j%2==0)
{
System.out.println("Second Thread : "+j+" is even");
Thread.sleep(1000);
}
}
}
catch(InterruptedException obj)
{
System.out.println("Exception in the second Thread");
}
}
}
class thread
{
public static void main(String args[])
{
user_Thread ob = new user_Thread();
try
{
for(int i =1;i<=30;i++)
{
if(i%2==0)
{
Thread.sleep(1000);
}
else 
{
System.out.println("first thread : "+i+"is odd");
}
}
}
catch(InterruptedException e)
{
System.out.println("first thread");
}
}
}