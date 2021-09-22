package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.pojo.Book;
import com.example.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {
	@Autowired
	@Resource
	private BookService bookService;
	
	@RequestMapping(value = "/getbooks",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @RequestMapping(value = "/getbook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Book getBook(@PathVariable int bid){
	    Book book =bookService.getBookById(bid);
	    if(book ==null){
	        throw  new  RuntimeException("该Id:"+bid+"没有信息");
        }
        return book;
    }
    public Book processHystrix_Get(@PathVariable  int bid){
        Book book=new Book();
        book.setBid(bid);
        book.setBname("没有任何数据！");
        book.setData_source("no this database in mysql ");
        return book;
    }
    @RequestMapping(value = "/addbook",method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @RequestMapping(value = "/updatebook",method = RequestMethod.POST,
                   produces = MediaType.APPLICATION_JSON_VALUE)
    public int updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
    @RequestMapping(value = "/reomvebook/{bid}",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public int reomveBook(@PathVariable int bid){
        return bookService.removeBoodById(bid);
    }
    @Value("server.port")
    private  String  port;
    @GetMapping("ribbontest")
    public int ribbonTest(@RequestParam int  num){
        System.out.println("========port"+port+"num:"+num);
	    return  1;
    }
}
