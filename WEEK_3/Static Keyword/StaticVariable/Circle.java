public class Circle{
    static int circleCount=0;
    public double x,y,r;
    public Circle(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
        circleCount++;
    }
    public Circle(double r){
        this(0.0,0.0,r);
        circleCount++;
    }
    public Circle(Circle c){
        this(c.x,c.y,c.r);
        circleCount++;
    }
    public Circle(){
        this(0.0,0.0,0.1);
        circleCount++;
    }
    public double circumference(){
        return(2*3.14*r);
    }
    public double area(){
        return(3.14*r*r);
    }
     public static void main(String args[]) {
        Circle c1=new Circle();
        Circle c2=new Circle(5.0);
        Circle c3=new Circle(c1);
        System.out.println("c1#" + c1.circleCount + "c2#" + c2.circleCount
        + "c3#" + c3.circleCount);
    }
}