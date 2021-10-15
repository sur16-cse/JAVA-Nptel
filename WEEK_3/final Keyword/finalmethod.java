abstract class Bike { 
    final void run(){
        System.out.println("Running");
    }
}
class Hondal extends Bike{
    Hondal(){
        System.out.println("Derived constructor is called");
    }
    void run(){
        System.out.println("Running safety with 100kmph");
    }
     
}
class finalmethod{
    public static void main(String[] args) {
        Bike honda=new Hondal();
        honda.run();
    }
}