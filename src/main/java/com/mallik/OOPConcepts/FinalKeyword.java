package main.java.com.mallik.OOPConcepts;

public class FinalKeyword {

    final int x=10;
    final void show(){
        System.out.println("show final method");
    }

}
class Keyword extends FinalKeyword{
    void shows(){
        System.out.println("class final show method");
    }
   // void show()
    //Cannot override methods that are final
}
class FinalKeyword1{
    public static void main(String[] args) {
        FinalKeyword F1=new FinalKeyword();
        F1.show();
        Keyword K1=new Keyword();
        K1.shows();
    }

}