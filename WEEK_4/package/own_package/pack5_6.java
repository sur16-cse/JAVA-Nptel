//import pack5.myclass;
//import pack6.myclass;
//cannot specify two classes having same name in one package suing import

public class pack5_6{
     public static void main(String[] args) {
        pack5.myclass a=new pack5.myclass();
        pack6.myclass b=new pack6.myclass();
        a.msg1();
        b.msg2();
    }
}