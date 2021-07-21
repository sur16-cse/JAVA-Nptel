public class Array_1d{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//array declaration
		int [] x;
		x=new int [10];
		for(int i=0;i<10;i++)
			x[i]=i;
		for(int i=0;i<10;i++)
			System.out.print(x[i]+" ");
		
		System.out.print("\n");
		
		int y []= {12, 3,9 , 15};
		for(int i=0;i<4;i++)
			System.out.print(y[i]+" ");
		
		System.out.print("\n");
		
		System.out.print(x.length);
			
	}

}
