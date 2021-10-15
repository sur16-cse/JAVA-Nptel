abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    void run(){
        System.out.println("Running safety");
    }
   public static void main(String[] args) {
        Honda obj=new Honda();
        obj.run();
        Bike obj1=new Honda();
        obj1.run();
    }
}