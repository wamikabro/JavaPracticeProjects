package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.BookCatalog.SolutionCode;

public class Book implements BookReadOnly {
    private int id;
    private String title;
    private String author;
    private Price price;

    @Override
    public int getId(){
        return id;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public String getAuthor(){
        return author;
    }

    public Book(int id, String title, String author, Double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = new Price(price);
    }

    @Override
    public String toString(){
        return title + " by " + author;
    }

    // Now returning the object reference on getPrice is not dangerous anymore, since the Price class is immutable now.
    // Until the method returning reference to the Map was there, things were in danger if someone got access to the price object reference.
    @Override
    public Price getPrice(){
        return this.price;
    }

    public void setPrice(Double price){
        this.price = new Price(price);
    }
}
