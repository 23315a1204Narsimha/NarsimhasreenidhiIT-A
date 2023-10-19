interface X
{
public int a=10;
public void showa();
}
interface Y
{
public int b=20;
public void showb();
}
class A implements X,Y
{
public void showa()
{
System.out.println("a is:"+a);
}
public void showb()
{
System.out.println("b is:"+b);
}
}
class Multiple
{
public static void main(String args[])
{
A ma=new A();
ma.showa();
ma.showb();
}
}