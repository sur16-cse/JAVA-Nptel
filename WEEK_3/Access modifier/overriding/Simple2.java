class A{
    public void msg1(){
        System.out.println("class A:Public");
    }
    private void msg2(){
        System.out.println("class A:Private");
    }
    protected void msg3(){
        System.out.println("class A:Protected");
    }
}

public class simple2 extends A{
    void msg(){
        System.out.println("class Main: Welcome");
    }
    public void msg1(){
        System.out.println("overriding public method");
    }
    private void msg2(){
        System.out.println("overriding private method");
    }
    public void msg3(){
        System.out.println("overriding protected method");
    }

    public static void main(String[] args){
        Simple2 obj=new Simple2();
        obj.msg();
    }
}