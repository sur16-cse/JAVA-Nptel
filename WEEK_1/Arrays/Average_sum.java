import java.util.Scanner;
public class Average_sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        float sum=0,avg;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }

        avg=sum/a.length;
        System.out.println("Average" + avg);
    }
}