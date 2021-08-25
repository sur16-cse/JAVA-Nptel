class do_while{
    public static void main(String args[]){
        int count=1;
        System.out.println("printing first 10 odd numbers");
        do{
            System.out.print(" "+((2*count)-1));
            count++;
        }while(count<11);
    }
}