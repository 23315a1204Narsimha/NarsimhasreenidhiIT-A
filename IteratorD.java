import java.util.*;
class IteratorD
{
    public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
    System.out.println(al);
    Iterator i=al.iterator();
    while (i.hasNext()) {
        Object o=i.next();
        System.out.print(o+"  ");
    }
    System.out.println();
    ListIterator li=al.listIterator();
    while (li.hasNext()) {
        Object o=li.next();
        li.set(o+"object");
        System.out.print(li);
    }
    System.out.println();
    i=al.iterator();
    while(i.hasNext())
    {
        Object o=i.next();
        System.out.print(o+" ");
    }
    System.out.println();
    while(li.hasPrevious())
    {
        Object o=li.previous();
        System.out.print(o+" ");
    }
    }
}