class area
{
int length,breath,height;
}
class triangle extends area
{
triangle(int l,int b,int h)
{
length = l;
breath = b;
height = h;
}
this void display()
{
int total;
System.out.println(total = length*breath+height);
}
}
class rectangle extends area
{
rectangle(int l,int b,int h)
{
length = l;
breath = b;
height = h;
}
this void display()
{
int total;
System.out.println(total = length*breath*height);
}
}
}
public class areas
{
public static void main(String abc[])
{
int a[] new int[5];
int i;
for(i=0;i<a.length;i++)
{
if(i<=1)
{
triangle a[i] = new triangle(2,3,4);
System.out.println(a[i].diaplay());
}
else
{
rectangle a[i] = new rectangle(2,4,6);
System.out.println(a[i].display();
}
}
}
}

