import java.util.Scanner;
class scannerDemo2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int num1,num2;
        num1=s.nextInt();
        System.out.println("Enter 2nd no.");
        num2=s.nextInt();
        if(num1>num2){
            System.out.println("1st no. is max");
        }
        else{
            System.out.println("2nd no. is max");
        }
    }
}