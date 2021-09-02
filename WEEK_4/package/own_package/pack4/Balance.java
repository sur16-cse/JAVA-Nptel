package pack4;
public class Balance{
    String name;
    double bal;
    public Balance(String n,double b){
        name=n;
        bal=b;
    }

    public void show(){
        if(bal<0){
        System.out.println("Sorry! Negative balance");
        }
        System.out.println(name+":"+bal);
    }
}