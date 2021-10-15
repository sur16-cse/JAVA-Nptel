// an abstract class with constructor
abstract class Base{
    Base(){
        System.out.println("Base constructor is called");
    }
     void fun(){
        System.out.println("Base fun is called");
     }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived constructor is called");
    }
    void fun(){
        
        System.out.println("Derived fun is called");
    }
}

class example4{
    public static void main(String[] args){
        Derived d=new Derived();
        d.fun();
    }
}