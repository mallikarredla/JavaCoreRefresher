package main.java.com.mallik.OOPConcepts;

 class ThiskeywordExample {

    String name;
    ThiskeywordExample(String name){
        this.name=name;
    }
    void showname(){
        System.out.println("the name is : " +name);
    }
}
public class ThisKeyword{
    public static void main(String[] args) {
        ThiskeywordExample K2=new ThiskeywordExample("Mallikarjuna");
        K2.showname();
        K2.name="Malli";
        K2.showname();
    }

}