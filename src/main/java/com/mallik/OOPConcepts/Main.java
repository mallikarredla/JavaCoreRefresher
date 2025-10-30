package main.java.com.mallik.OOPConcepts;
class Car {
    String brand;
    String model;

    public Car() {
        this.brand = "X";
        this.model = "Audi";
    }
public void defaultValues(){
    System.out.println("Brand is " + this.brand + ", Model is " + this.model);
}
    public void displayInfo() {
        System.out.println("Brand: " + this.brand + ", Model: " + this.model);
    }

    // Optional: method to update fields
    public void setInfo(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.defaultValues();

        c1.setInfo("Rolls Royce", "2020");
        c1.displayInfo();
        //c1.defaultValues();

        Car c2 = new Car();
        c2.setInfo("Cadillac", "2023");
        c2.displayInfo();
    }
}
