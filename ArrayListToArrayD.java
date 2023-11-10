import java.util.*;
class ArrayListToArrayD
{
    public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add(new Integer(6));
al.add(new Integer(3));
al.add(new Integer(0));
al.add(new Integer(4));
al.add(new Integer(5));
al.add(new Integer(1));
al.add(new Integer(3));
al.add(new Integer(7));
al.add(new Integer(0));
al.add(new Integer(2));
System.out.println("al is"+al);
Object a[]=al.toArray();
int sum=0;
for(int i=0;i<a.length;i++)
{
    System.out.println("a[i] is:"+a[i]);
   sum=sum+((Integer)a[i]);
   System.out.println("sum is :"+sum); 
}
 }
}