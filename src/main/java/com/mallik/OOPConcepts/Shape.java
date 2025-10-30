package main.java.com.mallik.OOPConcepts;

abstract class Shape1 {

    abstract double area();
}
class Square extends Shape1{
    double side;
    Square(double s){
        side=s;

    }
    double area(){

        return side *side;
    }

}
public class Shape {
    public static void main(String[] args) {
Shape1 s1=new Square(7) ;
        System.out.println(s1.area());

}
    }
