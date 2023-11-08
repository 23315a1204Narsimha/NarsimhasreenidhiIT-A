import java.io.*;
class FDirectory implements FilenameFilter
{
String extension;
FDirectory(String extension)
{
this.extension="."+extension;
}
public boolean accept(File dir,String name)
{
return name.endsWith(extension);
}
}
class FileNameDirectory
{
public static void main(String args[])
{
String path="/SNIST programs of java";
File f1=new File(path);
FilenameFilter fnf=new FDirectory("class");
String s[]=f1.list(fnf);
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]+" ");
}
}
}