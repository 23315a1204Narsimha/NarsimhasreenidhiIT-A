 class  appendDemo{
 public static void main(String args[]){
String s;
 int a=30;
StringBuffer  sb= new StringBuffer("hello");
s=sb.append("a=").append(a).append("!").toString();
System.out.println(s);
}
}