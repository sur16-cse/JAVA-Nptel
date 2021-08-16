// An applet to print Hello World

//imp packages for applet program
import java.applet.Applet;
import java.awt.Graphics;

//Applet and graphics r particular class

public class HelloWorld extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World",150,150);
    }
}