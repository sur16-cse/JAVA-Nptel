class circle{
    double x,y;
    double r;
    circle(double a,double b,double c){
       x=a;
       y=b;
       r=c;
    }

    circle (double c){
       // x=0;y=0;this.r=r;
        x=0;y=0;r=c;
    }

    circle(circle c){
        // x=c.x;
        // y=c.y;
        // r=c.r;
        x=c.x;y=c.y;r=c.r;
    }

    circle(){
         x=0.0;
        y=0.0;
         r=1.0;
    }

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return (22/7)*r*r;
    }
}

class constructor{
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