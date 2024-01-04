import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*<applet code=MouseEvents width=400 height=50>
</applet>*/
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
String msg=" ";
int mouseX=0,mouseY=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Mouse Pressed";
repaint();
}
public void mouseClicked(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Mouse Clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Mouse Entered";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Mouse Released";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="mouse Exited";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
showStatus("mouse moving at"+mouseX+","+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
showStatus("Mouse moving at"+me.getX()+","+me.getY());
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,mouseX,mouseY);
}
}