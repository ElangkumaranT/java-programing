import java.util.*;
public class longwordchain
{
    public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        System.out.print("enter n value");
        int n=o.nextInt();
        String s[]=new String[n+1];
        
        int c=0;
        System.out.print("enter a strings");
        for(int i=0;i<=n;i++)
        {
        s[i]=o.nextLine();
        }
        String k=s[1];
        String r=k;
        for(int i=1;i<=n;i++)
        {
            char f=k.charAt(k.length()-1);
            for(int j=2;j<=n;j++)
            {
                char l=s[j].charAt(0);
                if(f==l&&s[j].contains(r)==false)
                {
                    r=r+","+s[j];
                    k=s[j];
                    break;
                  
                }
            }
        }

        
        System.out.println(r);
    }
}