class Point2D{
    int x;int y;
    void display(){
        System.out.println("x="+x+" "+"y="+y);
    }
}

class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println("x="+x+" "+"y="+" "+"z="+z);
    }
}

class Example1{
     public static void main(String args[]) {
        Point2D p1=new Point2D();
        Point3D p2=new Point3D();
        p1.x=5;
        p1.y=7;
        System.out.print("point p1 is"+" ");
        p1.display();
        p2.x=9;
        p2.y=2;
        p2.z=4;
        System.out.print("point p2 is"+" ");
        p2.display();
    }
}