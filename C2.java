import java.io.*;  
      
    class C2{  
    public static void main(String args[]) throws Exception
    { 
    FileInputStream fin=new FileInputStream("/SNISTprogramsofjava/C2.java");
    FileOutputStream fout=new FileOutputStream("M.java");  
    int i;  
    while((i=fin.read())!=-1)
	{  
	System.out.println(i);
    fout.write(i);  
    }  
      System.out.println("Success....");
    fin.close();  
    }  
    } 