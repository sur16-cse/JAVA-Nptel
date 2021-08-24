import java.lang.*;

class calculator{
    double i;
    double x=Math.sqrt(i);
}

class Square_root{
    public static void main(String args[]){
        calculator a=new calculator();
        a.i=20;
        System.out.println("square root of" + a.i + " " + "is" +" " + a.x);
    }
}
