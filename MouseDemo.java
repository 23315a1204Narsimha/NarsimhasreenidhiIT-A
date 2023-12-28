import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Frame implements MouseListener,MouseMotionListener
{
public void mouseDragged(MouseEvent me)
{
System.out.println("Mouse Dragged");
}
public void mouseClicked(MouseEvent me)
{
System.out.println("Mouse clicked");
}
public void mouseEntered(MouseEvent me)
{
System.out.println("Mouse Entered");
}
public void mouseReleased(MouseEvent me)
{
System.out.println("Mouse Released");
}
public void mousePressed(MouseEvent ae)
{
System.out.println("Mouse Pressed");
}
public void mouseMoved(MouseEvent me)
{
System.out.println("Mouse Moved");
}
public void mouseExited(MouseEvent me)
{
System.out.println("Mouse Exited");
}
MouseDemo()
{
setVisible(true);
setSize(500,500);
addMouseMotionListener(this);
addMouseListener(this);
}
public static void main(String args[])
{
new MouseDemo();
}
}