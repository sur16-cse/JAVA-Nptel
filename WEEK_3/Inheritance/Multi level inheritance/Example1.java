class Box{
    private double width;
    private double height;
    private double depth;
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
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
}

class shipment extends BoxWeight{
    double cost;
    shipment(double w,double h,double d,double m,double c){
        super(w,h,d,m);
        cost=c;
    }
}

class Example1{
    public static void main(String[] args){
        shipment s1=new shipment(10,20,15,20,25);
        shipment s2=new shipment(5,10,15,20,25);
        double vol;
        vol=s1.volume();
        System.out.println("volmof shipment 1 is "+vol);
        System.out.println("weight of shipment 1 is "+s1.weight);
        System.out.println("cost of shipment 1 is "+s1.cost);
        System.out.println();
        vol=s2.volume();
        System.out.println("volmof shipment 2 is "+vol);
        System.out.println("weight of shipment 2 is "+s2.weight);
        System.out.println("cost of shipment 2 is "+s2.cost);
    }
}