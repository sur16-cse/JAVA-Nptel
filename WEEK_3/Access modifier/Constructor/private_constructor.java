public class A{
    private A(){

    }
    void msg(){
        System.out.println("Class A: Hello java!");
    }
}

public class private_constructor{
public static void main(String[] args) {
    A obj=new A();
}
}