 class A{
    private int data=40;
    public void msg(){
        System.out.println("class A: Hello java!");
    }
}

public class B{
     public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.data);//error
        obj.msg();
    }
}