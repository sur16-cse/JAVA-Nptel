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

class box{
    double width;
    double height;
    double depth;

    double area(){
        double a;
        a=(width*height + height*depth + depth*width);
        return a;
    }

    double volume(){
        double v;
        v=width*height*depth;
        return v;
    }
}

class multiClass{
    public static void main(String[] args){
        circle c = new circle();
        box b= new box();
        c.x=3.0;c.y=4.0;c.r=5.0;
        b.width=3.0;b.height=4.0;b.depth=5.0;
        System.out.println("circumference"+c.circumference());
        System.out.println("Area"+c.area());
        System.out.println("Area of Box"+b.area());
        System.out.println("Area"+b.volume());
    }
}