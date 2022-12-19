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
        Book book1 = new Book("Marqués De Murrieta Rioja", "Tinto", "1995", "España");
        bookService.addBook(book1);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book2 = new Book("Mar De Frades", "Blanco", "1999", "España");
        bookService.addBook(book2);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book3 = new Book("Muga", "Rosado", "2001", "España");
        bookService.addBook(book3);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Book book4 = new Book("Gato Negro", "Rosado", "2005", "Chile");
        bookService.addBook(book4);
    }
}
