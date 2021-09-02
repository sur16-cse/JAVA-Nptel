interface I1{
    public static int i=555;
    void printInterface();
}
class Example3 implements I1{
    public static int j=111;
    public void printInterface(){
        System.out.println("Geek!");
    }
   public static void main(String[] args) {
        Example3 a=new Example3();
        a.printInterface();
    }
}