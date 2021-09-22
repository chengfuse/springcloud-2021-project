package com.example.controller;

import com.example.pojo.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("consumer")
public class TextConroller {
    @Autowired
    @Resource
    private BookService service;

    @RequestMapping(value = "getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable int bid){
        return service.getBookById(bid);
    }
    @RequestMapping(value = "getbooks",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> listBook(){
        return service.getBooks();
    }
    @RequestMapping(value = "addbook",method =RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int addBook(@RequestBody  Book book){
        book.setCreateTime(new Date());
        return service.addBook(book);
    }
    @RequestMapping(value = "removebook/{bid}",method =RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int removeBook(@PathVariable int bid){
        return service.removeBookById(bid);
    }
    @RequestMapping(value = "updatebook",method =RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }
    @GetMapping("ribbontest")
    public int ribbonTest(@RequestParam int  num){
        for (int i = 0; i < 10; i++) {
            service.ribbonTest(num);
        }
        return  1;
    }
}

