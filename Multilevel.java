class A
{
void showa()
{
System.out.println("class A");
}
}
class B extends A
{
void showb()
{
System.out.println("class B with A");
}
}
class C extends B
{
void showc()
{
System.out.println("class C with B");
}
}
class Multilevel
{
public static void main(String args[])
{
C c=new C();
c.showa();
c.showb();
c.showc();
}
}