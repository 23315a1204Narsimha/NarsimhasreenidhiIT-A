import java.awt.*;
import java.applet.*;
/*<applet code="AppletDemo" width=300 height=40>
</applet>*/
public class AppletDemo extends Applet
{
String msg=" ";
public void init()
{
msg=msg+"Inside Init()--";
}
public void start()
{
msg=msg+"Inside start()--";
}
public void paint(Graphics g)
{
msg=msg+"Inside paint()";
g.drawString(msg,60,40);
}
}