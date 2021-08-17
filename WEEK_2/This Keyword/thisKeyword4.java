class A{
    void m(){
        System.out.println("hello m");
    }

    void n(){
        System.out.println("hello n");
        this.m(); //access another method which is in same cls using this
    }
}

class thisKeyword4{
    public static void main(String[] args){
        A a=new A();
        a.n();
    }
}