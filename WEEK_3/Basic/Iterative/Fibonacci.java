public class Fibonacci{
 
    public static void main(String[] args){
        int n;
        n=Integer.parseInt(args[0]);
        int fibo1=0,fibo2=1;
        System.out.println(fibo1+" "+fibo2);
        
        while(n>1){
            int fibo=fibo1+fibo2;
            System.out.print(" "+fibo);
            fibo1=fibo2;
            fibo2=fibo;
            n--;
        }
    }
}