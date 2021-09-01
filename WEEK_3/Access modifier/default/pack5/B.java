package pack5;
import pack4.*;//Import all class files in pack 1
class B{
     public static void main(String[] args) {
        A obj=new A();
        obj.msg();//compile time error
    }
}