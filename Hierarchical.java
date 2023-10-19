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
class C extends A
{
void showc()
{
System.out.println("Class c with A");
}
}
class Hierarchical
{
public static void main(String args[])
{
B b=new B();
C c=new C();
b.showa();
b.showb();
c.showa();
c.showc();
}
}
