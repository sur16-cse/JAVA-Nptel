private class A // class is private so all memebers are also priavte
{
    int data=40;
     void msg(){
        System.out.println("class A: Hello java!");
    }
}
 class B{
     public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.data);//error
        obj.msg();
    }
}