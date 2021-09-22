package com.example.service;



import com.example.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book getBookById(int bid);
    int updateBook(Book book);
    int removeBoodById(int bid);
    int addBook(Book book);
}
