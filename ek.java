import java.util.*;

class ek {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                System.out.print(j);
                break;
                }
                else
                c=c+1;  
            }
            if(c==0)
            System.out.print("0");
        }
    }
}