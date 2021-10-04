import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
public class Setbackground extends Applet{
    public void init(){
        setBackground(Color.YELLOW);
    }
    public void paint(Graphics g){
        g.drawString("hello java",150,150);
        g.drawString("IIT BOMBAY",50,20);
    }
}