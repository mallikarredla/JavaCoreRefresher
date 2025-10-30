package main.java.com.mallik.OOPConcepts;

class Book {
    String title;
    Book(String title){
        this.title=title;
    }
}
class Library{
    Book book;
    Library(Book book){
        this.book=book;

    }
    void showBook(){
        System.out.println("Book :" +book.title);
    }

}
public class ObjectPassedViaConstructor{
    public static void main(String[] args) {
        Book b=new Book("Java Basics");
        Library L1=new Library(b);
        L1.showBook();
    }
}