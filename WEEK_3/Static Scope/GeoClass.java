//static scope 1st example
class Box{
    float x=10.0;
    float y=20.0;
    float w=15.0;

    float area(){
        return (2*(x*y + x*w + y*w));
    }
}

class Circle{
    float x=0.0;
    float y=0.0;
    float r=5.0;

    float area(){
        return (22/7*(r*r));
    }
}

class GeoClass{
    float x=50;
    float y=60;
    public static void  main(String[] args) {
        Box b=new Box();
        Circle c=new Circle();
        System.out.println("GeoClass Data: x" + x);
        System.out.println("BoxClass Data: x" + b.x);
        System.out.println("Box Area: x" + b.area);
        System.out.println("CircleClass Data: x" + c.x);
        System.out.println("Circle Area: x" + c.area);
    }
}


