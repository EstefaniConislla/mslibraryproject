package library.mslibrary.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import library.mslibrary.model.Book;
import library.mslibrary.service.BookService;

@Component
public class BookFiller {
    private final BookService bookService;

    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init()
    {
        Book book1 = new Book("El principito", "Azul", "1995", "Francia");
        bookService.addBook(book1);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book2 = new Book("Matilda", "Blanco", "1988", "Reino Unido");
        bookService.addBook(book2);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book3 = new Book("Caballero Carmelo", "Rosado", "2001", "Perú");
        bookService.addBook(book3);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book4 = new Book("Naranja Lima", "Rosado", "1968", "Brazil");
        bookService.addBook(book4);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book5 = new Book("Los Heraldos Negros", "Negro", "1918", "Perú");
        bookService.addBook(book5);
    }
}
