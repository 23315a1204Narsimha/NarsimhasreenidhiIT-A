import java.awt.*;

public class ButtonDemo extends Frame
{
    ButtonDemo()
    {
        super("Button Demo");
        setVisible(true);
        setSize(500,500);
        Button b1=new Button("Click here");
        b1.setSize(10,20);
        add(b1);
    }
    public static void main(String args[])
    {
        new ButtonDemo();
    }
}