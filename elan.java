import java.util.*;
public class elan
{
public static void main(String[] args) 
{
int rows1 = 5;
int rows2 = 5;

if (rows1 == rows2) {
printPattern(rows1);
} 
else 
{
System.out.println("Number of rows should be the same.");
}
}

static void printPattern(int rows) {
for (int i = rows; i >= 1; i--) {
for (int j = rows; j >= i; j--) {
System.out.print(j);
}
for (int j = i + 1; j <= rows; j++) {
System.out.print(rows);
}
System.out.println();
}
}
}