import java.awt.*;
class Octagon extends Frame
{
Octagon()
{
super("Octagon");
setVisible(true);
setSize(500,500);
}
public void paint(Graphics g)
{
int xValues[]={10,20,30,40,50,60,70,80};
int yValues[]={10,20,30,40,50,60,70,80};
g.drawPolygon(xValues,yValues,8);
}
public static void main(String args[])
{
new Octagon();
}
}