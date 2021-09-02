interface I1{
    public static final double PI=3.14;
    static final double lambda=0.04;// public is implicit

    //int x; //declarations of any instance variable is not allowed
    int x=100; //initialization of variable is necessary
    //private static final int p=444; //private,protected not allowed
    //abstract public static void methodI1();//static method is not allowed
    void methodI2();

}
class A1 implements I1{
    public int a1=555;
    public void methodI1(){
        System.out.println("From I1 "+ PI);
    }
    public void methodI2(){
        System.out.println("Again from I1 "+lambda);
    }
}

public class Example1{
    public static void main(String[] args) {
        A1 a=new A1();
        a.methodI1();
        a.methodI2();
    }
}