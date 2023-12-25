import java.awt.*;
class Gui extends Frame
{
    public static void main(String[] args) {
        new Gui();
        Button b1=new Button("hello");
        add(b1);
        setVisible(true);
        setSize(500,500);
    }
}