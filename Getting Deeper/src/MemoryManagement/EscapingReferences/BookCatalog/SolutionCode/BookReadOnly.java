package MemoryManagement.EscapingReferences.BookCatalog.SolutionCode;

public interface BookReadOnly {
    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    Price getPrice();
}
