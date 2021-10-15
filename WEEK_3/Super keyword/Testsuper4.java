import java.lang.*;
class Point2D{
    double x;double y;
    Point2D(){
        x=0.0;
        y=0.0;
    }
    Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
}

class Point3D extends Point2D{
    double z;
    Point3D(){
        super();
        z=0.0;
        System.out.printf("%d%d%d",x,y,z);
    }
    Point3D(double x,double y,double z){
        super(x,y);
        this.z=z;
        System.out.printf("%d%d%d",x,y,z);
    }
}

class Testsuper4{
     public static void main(String args[]) {
         Point2D q=new Point2D(4.9,9.0);
        Point3D p=new Point3D(2.0,3.0,4.0);
       
    }
}