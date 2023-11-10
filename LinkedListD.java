import java.util.*;
class LinkedListD
{
    public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.add("1");
    ll.add("2");
    ll.add("3");
    ll.add("4");
    System.out.println(ll);
    Object o=ll.get(1);
    ll.set(1,(String)o+"Changed");
    System.out.println(ll);
    }
}