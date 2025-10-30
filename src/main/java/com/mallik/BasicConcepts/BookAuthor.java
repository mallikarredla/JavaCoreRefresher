package main.java.com.mallik.BasicConcepts;

public class BookAuthor {




        String title;
        String author;


        BookAuthor() {
            this.title = "Hebrew";
            this.author = "Salamon";
        }
        void printDetails(){
            System.out.println(" The Book was Written by : " + author + " and the title is :" +title );

        }
        void setAuthor(){
            System.out.println("Jared");
        }
        void setTitle(){
            System.out.println("Holocast");
        }
    }
    class Main1{
        public static void main(String[] args) {
            BookAuthor B1=new BookAuthor();
            B1.printDetails();
            B1.setAuthor();
            B1.setTitle();

        }

    }

