package com.service;

import com.entity.Book;
import com.entity.BookType;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    List<Book> getBookByName(String bookName);

    List<Book> getBookByAuthor(String authorName);

    List<BookType> getBookType();

    List<Book> getBookByType(Integer id);

    Book getBookById(Integer id);
}
