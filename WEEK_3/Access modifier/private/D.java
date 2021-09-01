class A{
    private int data=40;
    public void msg(){
        System.out.println("class A: Hello java!"+data);
    }
}

public class D{
     public static void main(String[] args) {
        public int data2=100;//error
        private int data3=200;//error
        A obj=new A();
        System.out.println("class D:"+data2 +data3); //private data lies in same class
        obj.msg();
    }
}

//in the main class if  their r any members then declared with default access specifier 