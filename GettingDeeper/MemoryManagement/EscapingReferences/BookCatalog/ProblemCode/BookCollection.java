package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.BookCatalog.ProblemCode;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books;

    public BookCollection(){
        books = new ArrayList<Book>();
        books.add(new Book(1, "Don A", "Miguel De Aervantes", 3.99));
        books.add(new Book(2, "Don B", "Miguel De Bervantes", 4.45));
        books.add(new Book(3, "Don C", "Miguel De Cervantes", 3.99));
        books.add(new Book(4, "Don D", "Miguel De Dervantes", 7.60));
        books.add(new Book(5, "Don E", "Miguel De Eervantes", 9.99));
        books.add(new Book(6, "Don F", "Miguel De Fervantes", 4.45));
        books.add(new Book(7, "Don G", "Miguel De Gervantes", 11.50));
        books.add(new Book(8, "Don H", "Miguel De Hervantes", 3.99));
        books.add(new Book(9, "Don I", "Miguel De Iervantes", 7.60));
        books.add(new Book(10, "Don J", "Miguel De Jervantes", 3.99));
    }

    // TODO: escaping reference
    public Book findBookByName(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){
        for(Book book: books){
            System.out.println(book.getTitle() + ": " + book.getPrice());
        }
    }
}
