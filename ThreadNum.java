import java.util.*;
class Even extends Thread
{
public void run()
{
for(int i=1;i<10;i++)
{
if(i%2==0)
{
System.out.println("Even is:"+i);
}
else
{
System.out.println(" ");
}
}
}
}
class Odd extends Thread
{
public void run()
{
for(int i=1;i<10;i++)
{
if(i%2!=0)
{
System.out.println("Odd is:"+i);
}
else
{
System.out.println(" ");
}
}
}
}
class ThreadNum
{
public static void main(String args[])
{
Odd o=new Odd();
Even e=new Even();
Thread t1=new Thread(e);
Thread t2=new Thread(o);
t1.start();
t2.start();
}
}