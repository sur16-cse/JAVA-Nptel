class Point2D{
    int x;int y;
    Point2D(){

    }
    Point2D(int a,int b){
        x=a;
        y=b;
    }
    void display(){
        System.out.println("x="+x+" "+"y="+y);
    }
}

class Point3D extends Point2D{
    Point3D(){

    }
    int z;
    Point3D(int c){
        z=c;
    }
    void display(){
        System.out.println("x="+x+" "+"y="+y+" "+"z="+z);
    }
}

class using_cast{
     public static void main(String args[]) {
        Point2D p1=new Point2D(3,-4);
        p1.display();
        Point3D p2=new Point3D(7);
        p2.display();
        //Point2D cast=p2;//implicit upcast
        Point2D cast=(Point2D) p2;//explicit upcast
        cast.display();
    }
}