import java.util.*;
public class airplane
{
    public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
         String s1=o.nextLine();
        String s=o.nextLine();
        char c[]=s.toCharArray();
        String r="";
        int k=1;
        for(int i=0;i<s.length();i++)
        {
            if(i%3==0)
            r=r+" ";

            if(c[i]==' ')
            c[i]='0';

            r=r+c[i];
        }
        String ss[]=r.split(" ");
        
      
        for(int i=1;i<ss.length;i++)
        {
            for(int j=0;j<ss.length;j++)
            {
                if(j)
            }
        }
    }
}