//class must implements interface and taht class used as an normal class 
//reverse is not true implement cannot implement another interface
interface I1{
    public static int i=555;
    void printInterface();
}
interface I2 implements I1{
    public static int j=111;
    public void printInterface(){
        System.out.println("Geek!");
    }
}