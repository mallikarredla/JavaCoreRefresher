package main.java.com.mallik.StringConcepts;

public class CountVowelConstants {
    public static void main(String[] args) {
        String str="HELLO JAVA DEVELOPER";

        int vowels = 0, consonants = 0;
        str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
    }




