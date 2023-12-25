public import java.awt.*;
class LabelDemo extends Frame {
    LabelDemo() {
        super("LabelDemo");
        setVisible(true);
        setLocation(400,200);
        setSize(500, 500);
        Label l = new Label("Hi Bunny", 1);
        add(l);
    }
    public static void main(String args[])
    {
        new LabelDemo();
    }
} LabelDemo {
    
}
