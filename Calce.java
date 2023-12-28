import java.awt.*;
import java.awt.event.*;
public class Calce extends Frame implements ActionListener
{
Label l1,l2,l3;
Button b1,b2,b3;
TextField t1,t2,t3;
Calce()
{
super("Calce");
setLayout(new FlowLayout());
setVisible(true);
setSize(500,500);
l1=new Label("First Number");
l2=new Label("Second Number");
l3=new Label("Result");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("Add");
b2=new Button("Subtract");
b3=new Button("Clear");
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
if(ae.getSource()==b1)
{
int Add=a+b;
t3.setText(Add+"");
}
if(ae.getSource()==b2)
{
int Subtract=a-b;
t3.setText(Subtract+"");
}
if(ae.getSource()==b3)
{
t1.setText(" ");
t2.setText(" ");
t3.setText(" ");
}
}
public static void main(String args[])
{
new Calce();
}
}