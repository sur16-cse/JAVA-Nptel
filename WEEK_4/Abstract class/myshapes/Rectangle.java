package myshapes;
public class Rectangle extends Geometry{
    protected double l,w;
    public Rectangle(){
        l=0.0;
        w=0.0;
    }

    public Rectangle(double l,double w){
        this.l=l;
        this.w=w;
    }

    public double area(){
        return l*w;
    }

    public double circumference(){
        return 2*(l+w);
    }
    
    public double getwidth(){
        return w;
    }

    public double getlength(){
        return l;
    }
}

