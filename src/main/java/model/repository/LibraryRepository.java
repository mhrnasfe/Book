package model.repository;

import model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    List<Book> library = new ArrayList<>();

    public void saveBook (Book book) {
        library.add(book);
    }

    public List<Book> findAll() {
        return library;
    }
}
