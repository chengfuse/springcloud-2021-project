package com.example.service;

import com.example.pojo.Book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;

import java.util.List;
@FeignClient( name="SPRINGCLOUD-BOOK" ,fallbackFactory=BookServiceFallBackFactory.class)
public interface BookService {
    @RequestMapping(value = "/getbooks",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks();
    @RequestMapping(value = "/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable int  bid);
    @RequestMapping(value = "/updatebook",method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  int  updateBook(@RequestBody Book  book);
    @RequestMapping(value = "/reomvebook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  int  removeBookById(int  bid);
    @RequestMapping(value = "/addbook",method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  int addBook(@RequestBody Book  book);
    @GetMapping("ribbontest")
    public int ribbonTest(@RequestParam int  num);
}
