import java.applet.*;
import java.awt.*;

public class RectangleTest extends Applet{
    int x, y, w, h;
    public void init( ){
        x=Integer.parseInt(getParameter(" xValue"));
        y=Integer.parseInt(getParameter(" yValue"));
        w=Integer.parseInt(getParameter(" wValue"));
        h=Integer.parseInt(getParameter(" hValue"));
    }

    public void paint(Graphics g){
        g.drawRect(x, y, w, h);
    }
}