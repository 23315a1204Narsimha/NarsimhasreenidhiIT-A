import java.awt.*;
class DrawDemo extends Frame
{
DrawDemo()
{
super("DrawDemo");
setSize(500,500);
setVisible(true);
}
public void paint(Graphics g)
{
g.drawRect(100,100,50,50);
g.setColor(Color.WHITE);
}
public static void main(String args[])
{
new DrawDemo();
}
}