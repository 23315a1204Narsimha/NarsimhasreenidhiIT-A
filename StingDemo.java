class StingDemo{
public static void main(String args[]){

	String s = new String(); 
	System.out.println(s);

	char chars[ ] = { 'a', 'b', 'c' };
	String s1 = new String(chars);
	System.out.println(s1);

	char chars2[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
 	String s2 = new String(chars2, 2, 3);
	System.out.println(s2);

	String s3 = "java"; 

	String s4=new String(s3);
	System.out.println(s3);
	System.out.println(s4);

	byte ascii[]={65,66,67,68,69,70};
	String s5=new String(ascii);
	System.out.println(s5);
	String s6=new String(ascii,2,3);
	System.out.println(s6);

	System.out.println(s1.length());
	
	String age="9";
	String s7="he is "+age+" years old.";
	System.out.println(s7);
	
	String s8="four:"+2+2;
	System.out.println(s8);

	char ch;
 	ch="abc".charAt(1);
	System.out.println(ch);
	
	char ch2[] = new char[10];
        String str = "New  Version in Java";
        str.getChars(5,9,ch2,0);
        System.out.println(ch2);

	    String str2 = "abc" + "ABC";
		byte[] b = str2.getBytes();

		System.out.println(str2);
		for(int i=0;i<b.length;i++)
		{
		    System.out.print(b[i]+"  ");
		}

	String  text = "Coffee Cup";
               char ch3[] = text.toCharArray();
		for(int i=0;i<ch3.length;i++)
		{
                 System.out.print(ch3[i]);
		 }
	}
	
}