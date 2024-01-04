import java.io.*;
import java.net.*;
class Client
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket("localhost",1010);
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
DataInputStream kb=new DataInputStream(System.in);
String str,str1;
while(!(str=kb.readLine()).equals("exit"))
{
dos.writeBytes(str+"\n");
str1=dis.readUTF();
System.out.println(str1);
}
dos.close();
dis.close();
kb.close();
s.close();
}
}