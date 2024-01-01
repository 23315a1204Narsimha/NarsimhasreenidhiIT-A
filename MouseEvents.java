// Demonstrate the mouse event handlers using Frame window.
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame  {
public MouseEvents(){  
     addMouseListener(new ExMouse());
     addMouseMotionListener(new ExMouse());
	setSize(200,200);
  	 setVisible(true);
  }
public static void main(String args[]){
	new MouseEvents();
      }
}
class ExMouse implements MouseListener, MouseMotionListener{
// Handle mouse clicked.
  public void mouseClicked(MouseEvent me) {
System.out.println( "Mouse clicked.");
    }
  // Handle mouse entered.
  public void mouseEntered(MouseEvent me) {
System.out.println( "Mouse entered.");   
  }
  // Handle mouse exited.
  public void mouseExited(MouseEvent me) {
System.out.println("Mouse exited.");
     }
// Handle button pressed.
  public void mousePressed(MouseEvent me) {
System.out.println(  "Down");
  }
// Handle button released.
  public void mouseReleased(MouseEvent me) {
System.out.println( "Up");  
  }

  // Handle mouse dragged.
  public void mouseDragged(MouseEvent me) {
System.out.println("Dragging mouse ");   
  }
 // Handle mouse moved.
  public void mouseMoved(MouseEvent me) {
    // show status
System.out.println("Moving mouse ");
  }
}


