package main.java.com.mallik.OOPConcepts;

abstract class Shape7 {
    abstract double area();
}
class Circle extends Shape{
    double side;
    Circle(double S){
        side=S;
    }
    double area(){
        return side*side;
    }
}
public class ConcreteImplementationAbstract {
    public static void main(String[] args) {
        Circle C1 = new Circle(9);
        C1.area();
    }
}