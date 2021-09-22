package com.example.service.impl;


import com.example.dao.BookDao;
import com.example.pojo.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	@Resource
	private BookDao bookDao;

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.findBooks();
	}

	public Book getBookById(int bid) {
		// TODO Auto-generated method stub
		return bookDao.findBookById(bid);
	}

	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	public int removeBoodById(int bid) {
		// TODO Auto-generated method stub
		return bookDao.delBookById(bid);
	}

	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

}
