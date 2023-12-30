import java.awt.event.*;
import java.awt.*;
class KeyDemo extends Frame implements KeyListener
{
public void keyPressed(KeyEvent ke)
{
System.out.println("Key Pressed");
}
public void keyTyped(KeyEvent ke)
{
String str=" ";
str=str+ke.getKeyChar();
System.out.println(str);
System.out.println("Key Typed");
}
public void keyReleased(KeyEvent ke)
{
System.out.println("Key Released");
}
KeyDemo()
{
setVisible(true);
setSize(500,500);
addKeyListener(this);
}
public static void main(String args[])
{
new KeyDemo();
}
}