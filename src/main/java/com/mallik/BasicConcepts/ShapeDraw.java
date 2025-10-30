package main.java.com.mallik.BasicConcepts;

public class ShapeDraw {
    public void draw(){
        System.out.println("Drawing a  shape");

    }
}

class main4 {
     public static void main(String[] args) {
         ShapeDraw s1=new Rectangle1();
         s1.draw();
ShapeDraw s2=new Square();
s2.draw();

     }

}
