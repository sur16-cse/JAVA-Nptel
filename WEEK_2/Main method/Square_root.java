import java.lang.*;

class calculator{
    double i;
    double x;
    void calcul(double i){
        x=Math.sqrt(i);
        //return x;
    }
}

class Square_root{
    public static void main(String args[]){
        calculator a=new calculator();
        a.i=20;
        a.calcul(a.i);
        System.out.println("square root of" + a.i + " " + "is" +" " + a.x);
    }
}
