package main.java.com.mallik.BasicConcepts;

public class Vehicle {
    Vehicle(){
        System.out.println("main.java.com.mallik.BasicConcepts.Vehicle is created");
    }
    void StartEngine(){
        System.out.println("main.java.com.mallik.BasicConcepts.Vehicle engine started");
    }
}
 class Auto1 extends Vehicle{
    Auto1(){
        super();
        System.out.println("main.java.com.mallik.BasicConcepts.Auto1 is created");
    }
    void StartAuto1(){
        super.StartEngine();
        System.out.println("main.java.com.mallik.BasicConcepts.Auto1 Engine is started");
    }

}
 class mainVehicle {
    public static void main(String[] args) {
       // main.java.com.mallik.BasicConcepts.Auto1 B1=new main.java.com.mallik.BasicConcepts.Vehicle();
      //  main.java.com.mallik.BasicConcepts.Vehicle A1=new main.java.com.mallik.BasicConcepts.Auto1();
        Auto1 A1=new Auto1();
        A1.StartEngine();



    }
}