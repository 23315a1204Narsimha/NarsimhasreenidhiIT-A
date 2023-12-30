import java.awt.event.*;
import java.awt.*;
class MyActionListener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
System.out.println("Button clicked");
}
}
class TestButton extends Frame
{
TestButton()
{
super("TestButtonListener");
MyActionListener al=new MyActionListener();
setVisible(true);
setSize(500,500);
Button b=new Button("Click Here");
b.addActionListener(al);
add(b);
}
public static void main(String args[])
{
new TestButton();
}
}