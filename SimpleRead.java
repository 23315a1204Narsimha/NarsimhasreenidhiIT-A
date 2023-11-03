import java.io.*;  
class SimpleRead{  
 public static void main(String args[]){  
try{
	int s=32;
	System.out.println(s);
	System.out.println((char)s);
    FileInputStream fin=new FileInputStream("/SNISTprogramsofjava/SimpleRead.java");  
    int i;  
    while((i=fin.read())!=-1)
	{   
	System.out.println(i+" "); 
	System.out.println((char)i);
        }
      fin.close();  
   }
catch(Exception e)
{
System.out.println(e);
}
}  
} 