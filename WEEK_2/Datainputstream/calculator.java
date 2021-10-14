import java.io.*;
class calculator{
    public static void main(String args[]){
        Float principal_amount=new Float(0);
        Float rate_of_interest=new Float(0);
        BufferedReader inc = null;
        int numberOfYears=0;
            //Input start
            try{
            DataInputStream in=new DataInputStream(System.in);
            String tempString;

            System.out.print("enter principal amount");
            System.out.flush();
            tempString=in.readLine();
            principal_amount=Float.valueOf(tempString);

            System.out.print("enter rate of interest");
            System.out.flush();
            tempString=in.readLine();
            rate_of_interest=Float.valueOf(tempString);

            System.out.print("enter number of years");
            System.out.flush();
            tempString=in.readLine();
            numberOfYears=Integer.parseInt(tempString);
            //Input end
            float interest_total=principal_amount*rate_of_interest*numberOfYears;
            System.out.println("Total interest " + interest_total);
            }
        
         catch(Exception e){
             System.out.println("program not work");
         }
    }
}