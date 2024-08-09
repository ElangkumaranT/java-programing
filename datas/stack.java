
public class stack{
int s[] = new int[10];
int top;
stack(){
top = -1;
}
void push(int data)
{
if(top < 9)
s[++top] = data;
else 
System.out.println("stack is full");
}
int pop()
{
return s[top++];
}
}