//Multiple object declaration
class circle{
    double x,y;
    double r;

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return (22/7)*r*r;
    }
}

class circleDemo2{
     public static void main(String[] args) {
        circle c1=new circle();
        circle c2=new circle();
        c1.x=3.0;
        c1.y=4.0;
        c1.r=5.0;
        c2.x=-4.0;
        c2.y=-8.0;
        c2.r=10.0;
        System.out.println("circumference"+c1.circumference());
        System.out.println("Area"+c1.area());
        System.out.println("circumference"+c2.circumference());
        System.out.println("Area"+c2.area());
    }
}