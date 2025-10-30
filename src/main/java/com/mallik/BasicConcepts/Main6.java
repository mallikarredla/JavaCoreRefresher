package main.java.com.mallik.BasicConcepts;

 abstract class Shape1 {

     abstract double area();

}
class Square1 extends Shape1{
     double side;
     Square1(double s){
         side=s;

     }
     double area(){
         return side * side;
     }
}
public class Main6{
    public static void main(String[] args) {
        Shape1 s=new Square1(6);
        System.out.println(s.area());
    }

}