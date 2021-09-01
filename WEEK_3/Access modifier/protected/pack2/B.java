//same file or folder no problem
 class A{
    public int i=555;
    protected void msg(){
        System.out.println("Hello java!"+i);
    }
}

class B extends A{
    public static void main(String args[]){
        A obj=new A();
        obj.msg();
    }
}