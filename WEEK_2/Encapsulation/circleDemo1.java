//Declaring object of circle type class
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

class circleDemo1{
     public static void main(String[] args) {
        circle c=new circle();
        c.x=0.0;
        c.y=0.0;
        c.r=5.0;
        System.out.println("circumference"+c.circumference());
        System.out.println("Area"+c.area());
    }
}