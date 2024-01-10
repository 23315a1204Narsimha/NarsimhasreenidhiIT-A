import java.awt.*;
class Simple extends Frame
{
    Simple()
    {
        setVisible(true);
        setSize(500,500);
    }
    public void paint(Graphics g)
    {
        int x[]={300,600,700,700,600,300,200,200};
        int y[]={100,100,300,500,700,700,500,300};
        g.drawPolygon(x,y,8);
    }
    public static void main(String args[])
    {
        new Simple();
    }
}
