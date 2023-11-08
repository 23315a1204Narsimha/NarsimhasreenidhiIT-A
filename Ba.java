import java.io.*;
class B
{
public static void main(String args[])
{
try{
FileInputStream f=new FileInputStream("/A.java");
int i=0;
while((i=f.read())!=-1)
{
System.out.println(i);
System.out.println((char)i);
}
f.close();
System.out.println("Success....");
}
catch(Exception e)
{
System.out.println("Exception is:"+e);
}
}
}
