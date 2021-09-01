import java.lang.*;
class A{
    double i;
    double x;
    void p(){
        x=Math.sqrt(i);
    }
}

class calculator{
    public static void main(String[] args) {
       A a=new A();
        a.i=20;
        a.p();
        System.out.println("sqaure root of "+a.i+" "+"is"+Math.floor(a.x));
    }
}