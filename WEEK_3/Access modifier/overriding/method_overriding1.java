class A{
    protected void msg(){
        System.out.println("Class A: Hello java");
    }
}

public class method_overriding1 extends A{
    //attempting to assign weaker access privileges; was protected
     void msg(){
        System.out.println("class method_overriding: Hello java");
    }
    public static void main(String args[]){
        method_overriding obj=new method_overriding();
        obj.msg();
        //A obj1=new A();
        //obj1.msg();
    }
}