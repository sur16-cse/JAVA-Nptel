//it does not whether class A and class B is in same directory or same file.

public class A{
    public int data=40;
    public void msg(){
        System.out.println("Class A: Hello java!");
    }
}

 public class B{
   public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.data);
        obj.msg();
    }
}