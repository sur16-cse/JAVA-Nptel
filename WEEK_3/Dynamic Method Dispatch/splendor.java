//refer parent class instance variable
class Bike{
    void run(){
        System.out.println("running");
    }
}

class splendor extends Bike{
    void run(){
        System.out.println("running safety with 60km");
    }

     public static void main(String[] args) {
        splendor b1=new splendor();
        b1.run();
        Bike b2=new Bike();
        b2.run();
        Bike b3=new splendor();//up casting
        b3.run();
    }
}