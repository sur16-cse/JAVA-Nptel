//Definig a class having method with paramter

class Point{
    int x,y;
    void setPoint(int a, int b){
        x=a;
        y=b;
    }
}

class pointMethodP{
    float distance;
    public static void main(String[] args){
        Point p=new Point();
        p.setPoint(15,20);
        System.out.println("x ="+p.x);
        System.out.println("y ="+p.y);
    }
}