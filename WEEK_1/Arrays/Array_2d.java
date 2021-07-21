import java.util.Scanner;
public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*int myArray [ ] [];
			myArray=new int [3] [4];*/
		Scanner sc=new Scanner(System.in);
			int myArray [] []=new int [3] [4];
			for(int i=0;i<3;i++)
				for(int j=0;j<4;j++)
					myArray[i][j]=sc.nextInt();
			for(int i=0;i<3;i++)
				for(int j=0;j<4;j++)
					System.out.print(myArray[i][j]+" ");
			
	}
}
