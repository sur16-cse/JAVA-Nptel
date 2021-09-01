//if it is in same file then there is no restriction so no need to make public java
//does not allow to make it public , make it default.

class A{
    public int data=40;
    public void msg(){
        System.out.println("Class A: Hello java!");
    }
}

  class B{
   public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.data);
        obj.msg();
    }
}