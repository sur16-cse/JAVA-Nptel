public class GCD{
    int m,n;
    int gcd(int m,int n){
        if(m>n) return gcd(n,m);
        if(m==n) return m;
        if(m==0) return n;
        if(m==1) return 1;
        return gcd(m,n%m);
    }

    public static void main(String[] args){
        GCD g=new GCD();
        g.m=Integer.parseInt(args[0]);
        g.n=Integer.parseInt(args[1]);
        System.out.printf("GCD of %d and %d is %d",g.m,g.n,g.gcd(g.m,g.n));
    }
}