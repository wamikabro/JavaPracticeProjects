package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.BookCatalog.SolutionCode;

public class Main {
    public static void main(String[] args) {
        BookCollection bc = new BookCollection();

        bc.printAllBooks();
        System.out.println(bc.findBookByName("Don C").getPrice().convert("EUR"));
        bc.printAllBooks();
    }
}
