class A{
    void msg(){
        System.out.println("Class A: Hello Java!");
    }
}

class simple1 extends A{
    protected void msg(){
        System.out.println("Class B: Welcome");
    }

     public static void main(String[] args) {
        simple obj=new simple();
        obj.msg();
    }
}