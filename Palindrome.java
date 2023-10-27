import java.util.*;
class Palindrome
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string:");
       String s1=sc.next();
       int i=0,j=(s1.length()-1); 
       while(i<j)
       {
        if(s1.charAt(i)!=s1.charAt(j))
        {
            System.out.println("not palindrome");
        }
        else
        {
            i++;
            j--;
            System.out.println("this is palindrome");
        }
       }
    }
}