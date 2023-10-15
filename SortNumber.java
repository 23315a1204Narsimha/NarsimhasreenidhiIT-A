//sorting numbers
import java.io.*;
public class SortNumber
{
public static void main(String args[])
{
int number[]={30,4,78,19,56,69};
int n=number.length;
System.out.println("given list of elements are ");
for(int i=0;i<n;i++)
{
	System.out.print(number[i]+" ");
}
	System.out.println("\n");
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(number[i]>number[j])
		{
			int temp=number[i];
			number[i]=number[j];
			number[j]=temp;
		}
	}
}
System.out.println("sorted list of elements ");
for(int i=0;i<n;i++)
{
	System.out.print(number[i]+" ");
}
}
}
