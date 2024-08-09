abstract class area
{
public int length,breath,height;
abstract void are();
}
class triangle extends area
{
triangle(int l,int b,int h)
{
length = l;
breath = b;
height = h;
}
void are()
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
void are()
{
int total;
System.out.println(total = length*breath*height);
}
}
public class areas
{
public static void main(String abc[])
{
int i;
area a[] = new area[5];
for(i=0;i<a.length;i++)
{
if(i<=1)
{
a[i] = new triangle(2,3,4);
}
else
{
a[i] = new rectangle(2,4,6);
}
}
}
}
