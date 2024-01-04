import java.io.*;
import java.net.*;
class Server
{
public static void main(String args[]) throws Exception
{
ServerSocket ss=new ServerSocket(1010);
Socket s=ss.accept();
System.out.println("Connection Established");
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
DataInputStream kb=new DataInputStream(System.in);
while(true)
{
String str,str1;
while((str=dis.readLine())!=null)
{
System.out.println(str);
str1=kb.readLine();
dos.writeUTF(str1);
}
dos.close();
kb.close();
s.close();
dis.close();
ss.close();
System.exit(0);
}
}
}