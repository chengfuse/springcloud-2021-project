package com.example.dao;

import com.example.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    @Select("select  * from  book")
    public List<Book>  findBooks();
    @Select("select  * from  book where bid=#{bid}")
    public  Book  findBookById(int  bid);
    @Update("update book set bname=#{bname},price=#{price},createTime=#{createTime} where bid=#{bid}")
    public  int  updateBook(Book  book);
    @Delete("delect from book where bid=#{bid}")
    public  int  delBookById(int  bid);
    @Insert("insert into book(bname,uid,price,createTime) values(#{bname},#{uid},#{price},#{createTime})")
    public  int addBook(Book  book);
}
