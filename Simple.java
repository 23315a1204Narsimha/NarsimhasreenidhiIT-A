class A
{
int i,j;
void showij()
{
System.out.println("i and j are:"+i+","+j);
}
}
class B extends A
{
int k;
void showk()
{
System.out.println("k is:"+k);
}
void sum()
{
int s=i+j+k;
System.out.println("sum of i and j and k:"+s);
}
}
class Simple
{
public static void main(String args[])
{
B b=new B();
b.i=10;
b.j=20;
b.k=30;
b.showij();
b.showk();
b.sum();
}
}
