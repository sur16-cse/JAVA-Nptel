interface I1{
    public static  int i=555;
    //public final static void printInterface();//error as method cant be final static
    public void printInterface();
}

class Example5 implements I1{
    public static int j=111;
    public void printInterface(){
        System.out.println("Geek!");
    }
   public static void main(String[] args) {
        Example5 a=new Example5();
        a.printInterface();
    }
}