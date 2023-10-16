import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                
                }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
    }
}
