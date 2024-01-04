import java.awt.*;
import java.applet.*;
/*<APPLET CODE=HelloAppletMsg WIDTH=500 HEIGHT=400>
<PARAM NAME="G" VALUE="I AM FINE">
</APPLET>*/
public class HelloAppletMsg extends Applet
{
String msg;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.blue);
msg=getParameter("G");
if(msg==null)
{
msg="Empty value";
}
}
public void paint(Graphics g)
{
g.drawString(msg,40,50);
}
}