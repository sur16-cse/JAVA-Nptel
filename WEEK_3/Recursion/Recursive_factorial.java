public class Recursive_factorial{
    int n;
    int factorial(int n){
        if(n==0)
           return (1);
        else
            return(n*factorial(n-1));
    }
    public static void main(String[] args) {
        Recursive_factorial x= new Recursive_factorial();
        x.n=Integer.parseInt(args[0]);
        System.out.println("Factorial of"+ n+":"+x.factorial(x.n));
    }
}