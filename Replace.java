public class Replace {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("this is a test");
        System.out.println(sb);
        sb.replace(5,7,"was");
        System.out.println(sb);
    }
}
