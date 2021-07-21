public class Array_3d{
    public static void main(String[] args){
        int my3DArray [] [] []=new int [3][4][5];
        int i,j,k;
        for(i=0;i<3;i++)
            for(j=0;j<4;j++)
                for(k=0;k<5;k++)
                    my3DArray[i][j][k]=i*j*k;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++)
                    System.out.print(my3DArray[i][j][k]+" ");
                    System.out.println();
            }
            System.out.println();
        }
    }
}