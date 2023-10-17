import java.util.*;

class SumOfInt{
public static void main(String args[]){
String t="1+2+3+4+5+6+7";
System.out.println("entered string is:"+t);
int sum=0;
StringTokenizer st=new StringTokenizer(t,"+");
while(st.hasMoreTokens())
{
String a=st.nextToken();
System.out.println(a);
int c=Integer.parseInt(a);
System.out.println("parseint of given string is:"+c);
sum=sum+c;
System.out.println("sum:"+sum);
}
System.out.println("total sum of string is:"+sum);
}
}

