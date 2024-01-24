import java.lang.reflect.Array;
import java.util.*;
class A
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of names");
        Scanner sc=new Scanner(System.in);
        int totalnames=sc.nextInt();
        String names[]=new String[totalnames];
        for(int i=0;i<totalnames;++i)
        {
            System.out.println("Enter the "+(i)+" name");
            names[i]=sc.nextLine();
        }
        Arrays.sort(names);
        for (int i=0;i<totalnames;++i)
        {
            System.out.println(names[i]);
        }
    }
}
