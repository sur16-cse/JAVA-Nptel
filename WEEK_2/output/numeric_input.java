import java.lang.*;
class calculator{
    double i;
    double x;
}
class numeric_input{
    public static void main(String args[]){
        calculator a=new calculator();
        a.i=Integer.parseInt(args[0]);
        a.x=Math.sqrt(a.i);
        System.out.println("Square root of"+a.i+" is "+a.x);
    }
}