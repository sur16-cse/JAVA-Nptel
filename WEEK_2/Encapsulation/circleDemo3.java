class circle{
    double x,y;
    double r;

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return (22/7)*r*r;
    }

    void setCircle(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
}

class circleDemo3{
    public static void main(String[] args){
        circle c1=new circle();
        circle c2=new circle();

        //Initialise 
        c1.setCircle(3.0,4.0,5.0);
        c2.setCircle(-4.0,8.0,12.0);
        System.out.println("circumference"+c1.circumference());
        System.out.println("Area"+c1.area());
        System.out.println("circumference"+c2.circumference());
        System.out.println("Area"+c2.area());
    }
}