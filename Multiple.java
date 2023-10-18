interface Z
{
    int a=10;
    public void displaya();
}
interface Y
{
    int b=20;
    public void displayb();
}
class C implements Z,Y
{
    public void displaya()
    {
        System.out.println("a is:"+a);
    }
    public void displayb()
    {
        System.out.println("B is:"+b);
    }
}
public class Multiple
{
    public static void main(String[] args) {
        C c=new C();
        c.displaya();
        c.displayb();
    }
}