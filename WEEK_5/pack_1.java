import myinterface.*;
class pack_1 implements anInterface{
    public void display(){
        System.out.println("Fine!");
    }

    public static void main(String[] args) {
        pack_1 t=new pack_1();
        t.display();
        System.out.println("The final value a in myinterface "+ a);
    }
}