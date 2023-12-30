import java.awt.*;
class Face extends Frame
{
    Face()
    {
        super("Drawing Face");
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawOval(100,100,200,200);
        g.drawOval(150,150,20,20);
        g.drawOval(220,150,20,20);
        g.drawArc(150, 200, 100, 50, 0, -180);
        
    }
    public static void main(String args[])
    {
        new Face();
    }
}