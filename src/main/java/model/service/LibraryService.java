package model.service;

import model.entity.Book;
import model.repository.LibraryRepository;

import java.util.List;

public class LibraryService {
    LibraryRepository libraryRepository = new LibraryRepository();

    public void saveBook(Book book) {
        libraryRepository.saveBook(book);
    }

    public List<Book> findAll() {
        return libraryRepository.findAll();
    }
}
