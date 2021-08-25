class A{
    int i,j;

    void showij(){
        System.out.println("i and j:"+i+" "+j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}

class Example3{
    public static void main(String args[]) {
        A a=new A();
        B b=new B();
        a.i=10;
        a.j=20;
        System.out.println("Contents of a: ");
        a.showij();
        System.out.println();

        b.i=3;
        b.j=4;
        b.k=5;
        System.out.println("Contents of b: ");
        b.showij();
        b.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in b:");
        b.sum();
        System.out.println();
    }
}

