
import java.lang.*;
class A implements Runnable
{
        public void run()
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("i is :"+i);
            }
        }
}
class B implements Runnable
{
    public void run()
    {
        for(int j=10;j>=5;j++)
        {
            System.out.println("j is :"+j);
        }
    }
}
class ThreadDemo
{
    public static void main(String[] args) {
        A a=new A();
        Thread t1=new Thread(a);
        B b=new B();
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}