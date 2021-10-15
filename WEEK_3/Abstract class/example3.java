// an abstract class with constructor
abstract class Base{
    Base(){
        System.out.println("Base constructor is called");
    }
    abstract void fun();
}

class Derived extends Base{
    Derived(){
        //super();
        System.out.println("Derived constructor is called");
    }
    Base(); // give error becoz this is not right way
    void fun(){
        System.out.println("Derived fun is called");
    }
}

class example2{
    public static void main(String[] args){
        Derived d=new Derived();
        d.fun();
    }
}