class A{
    private int data=40;
    public void msg(){
        System.out.println("class A: Hello java!"+data);
    }
}

public class C{
     public static void main(String[] args) {
       int data2=100;
        A obj=new A();
        System.out.println("class C:"+data2); //private data lies in same class
        obj.msg();
    }
}