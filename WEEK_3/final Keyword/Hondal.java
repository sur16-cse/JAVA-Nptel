final class Bike { }
class Hondal extends Bike{
    void run(){
        System.out.println("Running safety with 100kmph");
    }
     public static void main(String[] args) {
        Hondal honda=new Hondal();
        honda.run();
    }
}