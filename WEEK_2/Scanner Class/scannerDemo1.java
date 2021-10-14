import java.util.Scanner;
class scannerDemo1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int num1,num2;
        num1=s.nextInt();
        System.out.println("Enter 2nd no.");
        num2=s.nextInt();
        System.out.println("sum "+(num1+num2));
    }
}