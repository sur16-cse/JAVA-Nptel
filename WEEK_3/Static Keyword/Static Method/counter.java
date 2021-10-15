class counter{
    
    static void mymethod(int count){
        if(count==0)
        return;
        else{
            System.out.println("Hello "+count);
            mymethod(count--);
            System.out.println(count);
            return;
        }
    }
    public static void main(String[] args){
        mymethod(10);
    }
}