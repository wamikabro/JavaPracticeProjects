package javaBeginnersGuideProjects.PackagesAndInterfacesChapter8.bookpack;

public class Book1 {
    private String title;
    private String author;
    private int pubDate;

    public Book1(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
