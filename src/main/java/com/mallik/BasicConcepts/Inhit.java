package main.java.com.mallik.BasicConcepts;

class WildAnimal {

    String Lion;
    String Tiger;

    WildAnimal(){
        this.Lion=Lion;
        this.Tiger=Tiger;
    }
    void eat() {
        System.out.println("Animal is eating");
    }

}

 class Cat extends WildAnimal {
     void bark() {
         System.out.println("main.java.com.mallik.BasicConcepts.Cat is barking");
     }
 }
 public class Inhit {
     public static void main(String[] args) {
         Cat c1 = new Cat();
         //Doesnot workout because Parent class obj cannot referred to child class Obj.
        // main.java.com.mallik.BasicConcepts.WildAnimal c1=new main.java.com.mallik.BasicConcepts.WildAnimal();
         c1.bark();
         c1.eat();
     }
 }