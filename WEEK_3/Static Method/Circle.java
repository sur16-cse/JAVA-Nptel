public class Circle{
    public double x,y,r;
    //instance method
    public Circle bigger(Circle c){
        if(c.r>r) return c;
        else return this;
    }
    //class method
    public static Circle bigger(Circle a, Circle b){
        if(a.r>b.r) return a;
        else return b;
    }
    public static void main(String args[]) {
        Circle a=new Circle(2.0);
        Circle b=new Circle(3.0);
        Circle c=a.bigger(b);//call of instance method
        Circle d=Circle.bigger(a,b);//Call of class method
    }  
}