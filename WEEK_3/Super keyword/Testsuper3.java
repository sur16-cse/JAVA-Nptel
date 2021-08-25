class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("dog is created");
    }
}

class Testsuper3{
     public static void main(String[] args) {
        Dog d=new Dog();
    }
}