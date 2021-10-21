class A{
   private A(){

    }
    void msg(){
        System.out.println("class A: Hello java");
    }
}
public class public_constructor{
    public static void main(String args[]){
        A obj=new A();
        obj.msg();
    }
}