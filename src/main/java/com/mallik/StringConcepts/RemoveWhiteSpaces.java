package main.java.com.mallik.StringConcepts;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="MalliKarjuna Karedla";
        String str1="anil Babu Karedla";
        String result=str.replaceAll("\\s","");
        String result1=str1.replaceAll("a","s");
        String result2=str1.replaceAll("\s","");
String result3=str.toLowerCase();
String result4=str.replace("Malli","A");
String result5=str.replaceFirst("Mallikarjuna","Arjun");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result4);
        System.out.println(result5);
    }
}
