class BaseClass{
    public int x=10;
    private int y=10;
    protected int z=10;
    int a=10;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    private int getY(){
        return y;
    }
    private void setY(int y){
        this.y=y;
    }
    protected int getZ(){
        return z;
    }
    protected void setZ(int z){
        this.z=z;
    }
    int getA(){
        return a;
    }
    void setA(int a){
        this.a=a;
    }
}
public class overall extends BaseClass{
    public static void main(String args[]){
        BaseClass rr=new BaseClass();
        rr.z=0;
        overall oo=new overall();
        System.out.println("value of x is:"+oo.x);
        oo.setX(20);
        System.out.println("value of x is:"+oo.x);
        //private access
        // System.out.println("value of y is:"+oo.y);
        // oo.setY(20);
        // System.out.println("value of y is:"+oo.y);
        System.out.println("value of z is:"+oo.z);
        oo.setZ(30);
        System.out.println("value of z is:"+oo.z);
        System.out.println("value of a is:"+oo.a);
        oo.setA(30);
        System.out.println("value of a is:"+oo.a);
    }
}