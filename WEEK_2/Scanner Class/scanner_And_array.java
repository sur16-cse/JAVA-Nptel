import java.util.*;
class scanner_And_array{
    public static void main(String args[]){
        int sum=0;
        float avg=0f;
        ArrayList<Integer> l=new ArrayList<Integer>();
        System.out.println("Enter the input");
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt()){
            l.add(input.nextInt());
        }
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        avg=(float)sum/(l.size());
        System.out.println("Average: "+avg);
    }
}