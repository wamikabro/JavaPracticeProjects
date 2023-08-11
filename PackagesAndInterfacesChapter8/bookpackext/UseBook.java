package javaBeginnersGuideProjects.PackagesAndInterfacesChapter8.bookpackext;
import javaBeginnersGuideProjects.PackagesAndInterfacesChapter8.bookpack.*;

public class UseBook {
    public static void main(String[] args) {
        Book1 books[] = new Book1[5];
        books[0] = new Book1("Java: A Beginner's Guide", "Schidlt", 2019);

        for(int i = 0; i < books.length; i++) books[i].show();
    }
}
