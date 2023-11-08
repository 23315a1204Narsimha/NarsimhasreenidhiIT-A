import java.io.*;

class Datai {
  public static void main(String args[]) throws Exception
    {

    FileOutputStream fout = new FileOutputStream("Test.txt");
    DataOutputStream out = new DataOutputStream(fout);

    out.writeDouble(98.6);
    out.writeInt(1000);
    out.writeBoolean(true);

    out.close();

    FileInputStream fin = new FileInputStream("Test.txt");
    DataInputStream in = new DataInputStream(fin);

    double d = in.readDouble();
    int i = in.readInt();
    boolean b = in.readBoolean();

    System.out.println("Here are the values:  " + d + " " + i + " " + b);

    in.close();
  }
}