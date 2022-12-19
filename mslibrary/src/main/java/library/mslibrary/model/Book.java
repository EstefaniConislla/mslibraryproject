package library.mslibrary.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Book {
    private String bookId;
    private String name;
    private String color;
    private String year;
    private String country;
    public Book(String name, String color, String year, String country) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.country = country;
    }
}
