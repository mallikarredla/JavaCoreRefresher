package main.java.com.mallik.OOPConcepts;

import java.sql.SQLOutput;

class Calculator {

    int add(int a , int b){

        return a+b;

    }
    double add(double a, double b ){
        return a+b;
    }
    long add(long a, long b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
}
public class MethodOverLoading{
    public static void main(String[] args) {
        Calculator C1=new Calculator();
        System.out.println(C1.add(7,6));
        System.out.println(C1.add(4.5,5.6));
        System.out.println(C1.add(10L,50L));
        System.out.println(C1.add(12.3,23.5));
    }

}
