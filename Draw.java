import java.awt.*;
class Draw extends Frame
{ 
    public static void main(String[] args) {
        Frame w=new Frame();
        w.setVisible(true);
        w.setSize(100,200);
        Label l=new Label("Bunny");
        w.add(l);
    }
}