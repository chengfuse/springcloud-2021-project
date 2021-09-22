package com.example.service;

import com.example.pojo.Book;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookServiceFallBackFactory implements FallbackFactory<BookService> {
    @Override
    public BookService create(Throwable cause) {
        return new BookService() {
            @Override
            public List<Book> getBooks() {
                System.out.println("=====没有数据====");
                return null;
            }

            @Override
            public Book getBookById(int bid) {
                System.out.println("服务错误当前id"+bid+"有误");
                return null;
            }

            @Override
            public int updateBook(Book book) {
                return 0;
            }

            @Override
            public int removeBookById(int bid) {
                return 0;
            }

            @Override
            public int addBook(Book book) {
                return 0;
            }

            @Override
            public int ribbonTest(int num) {
                return 0;
            }
        };
    }
}
