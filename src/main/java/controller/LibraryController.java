package controller;

import model.entity.Book;
import model.service.LibraryService;

import java.util.List;

public class LibraryController {
    LibraryService libraryService = new LibraryService();

    public void saveBook(Book book) {
        libraryService.saveBook(book);
    }

    public List<Book> findAll() {
        return libraryService.findAll();
    }
}
