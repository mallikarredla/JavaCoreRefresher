package main.java.com.mallik.BasicConcepts;

public class SumOfDigits {
    public static void main(String[] args) {
        int number=6542;
        int sum=0;
        while(number!=0){
            sum=sum+number%10;//2
            number=number/10;

        }
        System.out.println("the sumofdigits " +sum);
    }

}
