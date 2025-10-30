package main.java.com.mallik.BasicConcepts;

class Godzilla {


     public void makeSound() {
         System.out.println("main.java.com.mallik.BasicConcepts.Godzilla was sounding");
     }
 }
     class Crocodile extends Godzilla {
         @Override
         public void makeSound() {
             System.out.println("main.java.com.mallik.BasicConcepts.Crocodile was crawling");

         }
     }

         class main {
             public static void main(String[] args) {
                 Godzilla G1 = new Crocodile();
                 G1.makeSound();


             }
         }




