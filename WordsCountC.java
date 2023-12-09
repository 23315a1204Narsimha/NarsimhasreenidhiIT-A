import java.io.*;
	import java.util.*;
	public class WordsCountC{
		public static void main(String args[ ]) throws IOException{
			FileInputStream fi=new FileInputStream(args[0]);
			int i;
			while((i=fi.read())!=-1)
{
System.out.println((char)i);
}
}
}