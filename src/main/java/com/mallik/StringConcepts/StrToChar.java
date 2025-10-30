package main.java.com.mallik.StringConcepts;

public class StrToChar {
    public static void main(String[] args) {

        String str="Hello Java Developer";
        String str1="Mallikarjunakaredla";
        str.toLowerCase();
        str1.toLowerCase();
        int vowels=0;
        int constants=0;
        for(char c:str1.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c)!=-1)
                    vowels++;
                else
                    constants++;


            }
        }
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c)!=-1)
                    vowels++;
                            else
                                constants++;

            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + constants);

        System.out.println("Vowels: " + vowels + ", Consonants: " + constants);

    }
    }
    //