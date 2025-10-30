package main.java.com.mallik.OOPConcepts;

 class Engine {
    void start(){
        System.out.println("Engine starts");
    }

}
class Steering{
     void Control(){
         System.out.println("Controll using steering");
     }
}
class Car1{
     void run(){
         Engine E =new Engine();
         E.start();
         Steering S1=new Steering();
         S1.Control();
         System.out.println("Car was running");
     }

}
public class CompositionExample{
    public static void main(String[] args) {
        Car1 C1=new Car1();
        C1.run();
    }
}

//Composition is the case where one class has the objects of other classess.
//Basically like an Has-A relationship