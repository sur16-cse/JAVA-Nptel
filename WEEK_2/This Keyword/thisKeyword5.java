//No object reation to invoke method
//call a constructor within a constructor
class A{
    A(){
        this(5);// calling another constructor inside another constructor using this
        System.out.println("hello a");
    }

    A(int x){
        System.out.println(x);
    }
}

class thisKeyword5{
    public static void main(String[] args){
        A a=new A();
    }
}