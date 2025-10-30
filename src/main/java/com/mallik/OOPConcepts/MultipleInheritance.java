package main.java.com.mallik.OOPConcepts;

import java.util.concurrent.Callable;

interface A{
    void showA();

}
interface B{
    void showB();
}
class C implements A,B{
    public void showA(){
        System.out.println("show A");
    }
    public void showB(){
        System.out.println("show B");
    }
}
class MultipleInheritance{
    public static void main(String[] args) {
      C c1=new C();
      c1.showA();
      c1.showB();


            }
        }

