import java.awt.*;
class BorderDemo extends Frame
{
BorderDemo()
{
setLayout(new BorderLayout());
Button b1=new Button("north");
Button b2=new Button("west");
Button b3=new Button("east");
Button b4=new Button("center");
Button b5=new Button("south");
add(b1,BorderLayout.NORTH);
add(b2,BorderLayout.WEST);
add(b3,BorderLayout.EAST);
add(b4,BorderLayout.CENTER);
add(b5,BorderLayout.SOUTH);
setSize(500,500);
setVisible(true);
}
public static void main(String args[])
{
new BorderDemo();
}
}