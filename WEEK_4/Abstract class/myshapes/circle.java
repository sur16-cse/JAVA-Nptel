package myshapes;
public class circle extends Geometry{
    public double r;
    public circle(){
        r=1.0;
    }

    public circle(double r){
        this.r=r;
    }

    public double area(){
       return PI*r*r;
    }

    public double circumference(){
        return 2*PI*r;
    }

    public double getRadius(){
        return r;
    }
}