class circle{
    double x,y;
    double r;

    double circumference(){
        return 2*3.14*r;
    }

    double area(){
        return (22/7)*r*r;
    }

    circle(double x,double y,double r){
       this.x=x;
       this.y=y;
       this.r=r;
    }
}

class thisKeyword{
    public static void main(String[] args){
        circle c1=new circle(3.0,4.0,5.0);
        circle c2=new circle(-4.0,8.0,12.0);

        System.out.println("circumference"+c1.circumference());
        System.out.println("Area"+c1.area());
        System.out.println("circumference"+c2.circumference());
        System.out.println("Area"+c2.area());
    }
}