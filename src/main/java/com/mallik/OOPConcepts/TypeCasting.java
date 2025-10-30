package main.java.com.mallik.OOPConcepts;

class Parent {
    void show(){
        System.out.println(" show parent method");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("show child method");
    }
}
public class TypeCasting{
    public static void main(String[] args) {
        Parent P1=new Child();//Upcasting
        P1.show();
        ((Child)P1).display();//Downcasting
    }
}