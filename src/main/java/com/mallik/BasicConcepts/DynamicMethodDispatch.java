package main.java.com.mallik.BasicConcepts;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle {

    void draw() {
        System.out.println("Drawing circle");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Shape s1 = new Shape(); // upcasting
        s1.draw();                // runtime polymorphism
    }
}
