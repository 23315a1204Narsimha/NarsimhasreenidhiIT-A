/*Write a program to print roots of a quadratic equation ax2+bx+c=0.*/
import java.io.*;
import java.util.*;
public class Quad{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the values for a,b & c");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	double d,e;
	d=((b*b)-(4*a*c));
	if(d==0){
		System.out.println("expression has real&equal roots");
		e=(-b)/(2*a);
		System.out.print("roots are:"+e+"\t"+e);
		}
	if(d>0){
		System.out.println("expression has real&unreal roots");
		e=(-b+Math.sqrt(d))/(2*a);
		System.out.print("roots are:"+e+"\t");
		e=(-b-Math.sqrt(d))/(2*a);
		System.out.println(e);
	}
	if(d<0){
		System.out.println("expression has imaginary rotts");
		}
	}
}
