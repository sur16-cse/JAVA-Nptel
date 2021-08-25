//Example of a superclass variable referring to subclass object
//superclass
class Box{
    double width;
    double height;
    double depth;

    Box(){ //Default setting by this constructor
    }

    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }

    double volume(){
        return width*height*depth;
    }
}

class BoxWeight extends Box{
    double weight;
    //Default constructor
    

    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);//call the overloaded constructor in the super class
        weight=m;
    }
}

class Using_constructor3{
    public static void main(String[] args) {
         Box myBox1=new Box();
         BoxWeight myBox2=new BoxWeight(2,3,4,0.76);
         double vol;
         vol=myBox2.volume();
         System.out.println("Volume of mybox2: "+vol);
         System.out.println("weight of mybox2: "+myBox2.weight);
         System.out.println();
        
         //assign BoxWeight refernce to Box refernce;
         myBox1=myBox2;
        vol=myBox1.volume();
         System.out.println("Volume of mybox1: "+vol);
         
     }
 }