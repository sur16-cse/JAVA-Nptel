//this with multiple constructor
// Multiple constructors or constructor overloading
class circle{
    double x,y;
    double r;
    circle(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    circle (double r){
       // x=0;y=0;this.r=r;
        this(0.0,0.0,r);
    }

    circle(circle c){
        // x=c.x;
        // y=c.y;
        // r=c.r;
        this(c.x,c.y,c.r);
    }

    circle(){
        // x=0.0;
        // y=0.0;
        // r=1.0;
        this(0.0,0.0,1.0);
    }

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return (22/7)*r*r;
    }
}

class thisKeyword2{
    public static void main(String[] args){
        circle c1=new circle(3.0,4.0,5.0);
        circle c2=new circle(5.0);
        circle c3=new circle(c1);
        circle c4=new circle();

        System.out.println("circumference"+c1.circumference());
        System.out.println("Area"+c1.area());
        System.out.println("circumference"+c2.circumference());
        System.out.println("Area"+c2.area());
        System.out.println("circumference"+c3.circumference());
        System.out.println("Area"+c3.area());
        System.out.println("circumference"+c4.circumference());
        System.out.println("Area"+c4.area());
    }
}