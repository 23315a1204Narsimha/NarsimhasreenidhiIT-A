import java.util.*;
class Ta extends Thread
{
void printTable(int n)
{
synchronized(this){
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+(n*i));
}
}
}
}
class T1 extends Thread
{
int a;
Ta ta;
T1(Ta ta)
{
this.ta=ta;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n");
a=sc.nextInt();
}
public void run()
{
ta.printTable(a);
}
}
class Table 
{
public static void main(String args[])
{
Ta obj=new Ta();
T1 t1=new T1(obj);
obj.start();
t1.start();
}
}
