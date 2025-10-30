package main.java.com.mallik.BasicConcepts;

public class MultiplicationTable {

    public static void main(String[] args){
        int number=4;
        System.out.println("the multiplication table of " +number);
        for(int i=1;i<=10;i++){
            System.out.println(number + " X " + i + " = " +number*i);
        }
    }
}
