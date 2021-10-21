//same file or folder no problem
class A{
    private int i=555;
    protected void msg(){
        System.out.println("Hello java!"+i);
    }
}

class C extends A{
    public static void main(String args[]){
        A obj=new A();
        obj.msg();
    }
}