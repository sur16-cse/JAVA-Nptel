class Circle{
    static double x,y,r;
    Circle(double r){
        this.r=r;
    }
    public static class Point{
        double x,y;
        void display(){
            System.out.println("(x,y): ("+ this.x + "," +this.y + ")");
        }
        Point(double a,double b){
            this.x=a;
            this.y=b;
        }
    }
    public boolean isInside(Point p){
        double dx=p.x-x;
        double dy=p.y-y;
        double distance=Math.sqrt((dx*dx)+(dy*dy));
        if(distance<r) return true;
        else return false;
    }
    public static void main(String[] args) {
        Circle a=new Circle(2.0);
        Point pa=new Point(1.0,2.0);
        pa.display();
        System.out.println("Is the points(1,2) inside the circle with radius 2:"+a.isInside(pa));
        Circle b=new Circle(1.0);
        Point pb=new Point(0.0,0.0);
        pb.display();
        System.out.println("Is the points(3,3) inside the circle with radius 1:"+b.isInside(pb));
    }
}