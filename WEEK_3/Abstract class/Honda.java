abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    void run(){
        System.out.println("Running safety");
    }
   public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
    }
}