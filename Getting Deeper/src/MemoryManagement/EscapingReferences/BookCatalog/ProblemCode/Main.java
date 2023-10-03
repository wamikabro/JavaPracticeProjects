package MemoryManagement.EscapingReferences.BookCatalog.ProblemCode;

public class Main {
    public static void main(String[] args) {
        BookCollection bc = new BookCollection();

        System.out.println(bc.findBookByName("Don C").getPrice().convert("EUR"));
    }
}
