//java program to basic calculation by using interface
import java.io.*;
import java.util.*;
interface Calculator
{
void addition(int a,int b);
void subtraction(int a,int b);
void multiplication(int a,int b);
void divison(int a,int b);
}
class A implements Calculator
{
public void addition(int a,int b)
{
System.out.println("Addition:"+(a+b));
}
public void subtraction(int a,int b)
{
System.out.println("Subtraction:"+(a-b));
}
public void multiplication(int a,int b)
{
System.out.println("Multiplication:"+(a*b));
}
public void division(int a,int b)
{
System.out.println("Division:"+(a/b));
}
}
public class BasicCalculator
{
public static void main(String args[])
{
int c,d;
A s=new A();
Scanner z=new Scanner(System.in);
System.out.println("Enter 2 numbers:");
c=z.nextInt();
d=z.nextInt();
s.addition(c,d);
s.subtraction(c,d);
s.multiplication(c,d);
s.division(c,d);
}
}
  
