import java.awt.*;
class Polygon8p extends Frame
{
    Polygon8p()
    {
        super("Drawing Face");
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        int xValues[] = { 20, 40, 50, 30, 20, 15,10,10 };
        int yValues[] = { 50, 50, 60, 80, 80, 60,30,20 };

        g.drawPolygon( xValues,yValues,8 );
        g.drawPolyline(xValues,yValues,8);
    }
    public static void main(String args[])
    {
        new Polygon8p();
    }
}