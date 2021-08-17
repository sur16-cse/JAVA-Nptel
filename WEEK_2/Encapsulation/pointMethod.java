//Encapsulation defining class with method but not a good practice bcoz if more
//than one oject created then both have same value

class Point{
    int x,y;
    void setPoint(){
        x=10;
        y=10;
    }
}

class pointMethod{
    float distance;
    public static void main(String[] args){
        Point p=new Point();
        p.setPoint();
        System.out.println("x ="+p.x);
        System.out.println("y ="+p.y);
    }
}