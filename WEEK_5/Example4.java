//it is also invalid
abstract class c{
    public static int j=111;
    void print(){
        System.out.println("Geek1!");
    }
}

interface I2 implements c{
    public static int j=222;
    void print(){
        System.out.println("Geek2!");
    }
}