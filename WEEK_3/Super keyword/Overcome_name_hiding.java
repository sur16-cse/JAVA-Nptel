class A{
    int i;
}

//create subclass by extending subclass A
class B extends A{
    int i;//this i hides the i in A
    B(int a,int b){
        super.i=a;//i in A
        i=b;//i in B
    }

    void show(){
        System.out.println("i in superclass "+super.i);
        System.out.println("i in subclass "+i);
    }
}

class Overcome_name_hiding{
   public static void main(String[] args) {
        B subobj=new B(1,2);
        subobj.show();
    } 
}