// An applet to print Hello World

//imp packages for applet program
import java.applet.Applet;
import java.awt.Graphics;

//Applet and graphics r particular class

public class InitMethod extends Applet{
    public void init(){
        resize(200,200);
    }
    public void paint(Graphics g){
        g.drawString("Hello World",150,150);
    }
}