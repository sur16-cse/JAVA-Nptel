import java.awt.*;

public class Mypanel{
    public static void main(String args[]){
        Frame frame=new Frame("Frame with panel");
        Panel panel=new Panel();
        frame.resize(200,200);
        frame.setBackground(Color.blue);
        frame.setLayout(null);
        panel.resize(100,100);
        panel.setBackground(Color.yellow);
        frame.add(panel);
        frame.show();
    }
}