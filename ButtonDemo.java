import java.awt.*;
import java.awt.event.*;
class MyActionListener implements ActionListener
{
   public void actionPerformed(ActionEvent ae)
    {
        System.out.println("Button pressed");
    }
}
class ButtonDemo extends Frame{
    ButtonDemo()
    {
        MyActionListener al=new MyActionListener();
        setVisible(true);
        setSize(500,500);
        Button b1=new Button("Click Here");
        b1.setSize(10,10);
        b1.addActionListener(al);
        add(b1);
    }
    public static void main(String args[])
    {
        ButtonDemo bd=new ButtonDemo();
    }
}
