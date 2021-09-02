import pack4.*;
class pack_4{
     public static void main(String[] args) {
        Balance current[]=new Balance[3];
        current[0]=new Balance("D. Samanta",124.23);
        current[1]=new Balance("T. Ahmed",157.02);
        current[2]=new Balance("N. Sambhu",-12.33);

        for(int i=0;i<3;i++){
            current[i].show();
        }
    }
}