package main.java.com.mallik.OOPConcepts;

 class Person {
     class Address{
         void showAddress(){
             System.out.println("Adderess of the person");
         }
     }
}

public class InnerClassExample{
    public static void main(String[] args) {
        Person.Address address=new Person().new Address();
        address.showAddress();
    }
}
//Improving Readablity and maintainance
//Grouping related to functionality together into one class instead of scattering small classes all over the project .