package day52.bookTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookFair {

    public static void main(String[] args) {

        Book b1 = new PaperBook("Java", "Akbar", 3);
        // this is the very similar idea as putting the small coffee cup into grande cup
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b4 = new PaperBook("The Kite Runner", "Khaled Hosseini", 3);
        Book b5 = new PaperBook("Lord of the Rings","J. R. R. Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R. R. Martin",95.5);


        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("b6 = " + b6);

        b5.displayBookInfo();
        b5.showTableOfContent();
        b5.takeNote();

        b6.displayBookInfo();
        b6.showTableOfContent();
        b6.takeNote();

//        b3.read();

        List<Book> bookList = Arrays.asList(b1,b2,b3,b4,b5,b6);

        for (Book eachBook : bookList) {
            eachBook.displayBookInfo();
        }





    }







}
