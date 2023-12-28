import java.awt.*;
class GridDemo extends Frame
{
GridDemo()
{
setLayout(new GridLayout(2,3,5,5));
Button b1=new Button("English");
Button b2=new Button("Telugu");
Button b3=new Button("Hindi");
Button b4=new Button("Arabic");
Button b5=new Button("Spanish");
Button b6=new Button("Japanese");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
setSize(500,500);
setVisible(true);
}
public static void main(String args[])
{
new GridDemo();
}
}