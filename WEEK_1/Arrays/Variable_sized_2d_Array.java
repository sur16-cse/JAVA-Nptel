import java.util.Scanner;
public class Variable_sized_2d_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
         
         int myArray2d [] []=new int [row][];
         for(int i=0;i<row;i++){
            int cols=sc.nextInt();
            myArray2d[i]=new int [cols];
            for(int j=0;j<cols;j++)
                myArray2d[i][j]=sc.nextInt();
         }

         for(int i=0;i<row;i++)
         {
             for(int j=0;j<myArray2d[i].length;j++)
              System.out.print(myArray2d[i][j]+" ");
         }
    }
}