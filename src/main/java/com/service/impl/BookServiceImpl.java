package com.service.impl;

import com.entity.AuthorExample;
import com.entity.Book;
import com.entity.BookExample;
import com.entity.BookType;
import com.mapper.BookMapper;
import com.mapper.BookTypeMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookTypeMapper bookTypeMapper;
    @Override
    public List<Book> getBooks() {
        List<Book> books=bookMapper.selectByExampleWithAuthorAndBookType(null);
        return books;
    }

    @Override
    public List<Book> getBookByName(String bookName) {
        BookExample example=new BookExample();
        BookExample.Criteria criteria=example.createCriteria();
        criteria.andBookNameLike("%"+bookName+"%");
        List<Book> books=bookMapper.selectByExampleWithAuthorAndBookType(example);
        return books;
    }

    @Override
    public List<Book> getBookByAuthor(String authorName) {

        List<Book> books=bookMapper.selectByExampleWithAuthorAndBookTypeByAuthor(authorName);
        return books;
    }

    @Override
    public List<BookType> getBookType() {
        List<BookType> bookTypes=bookTypeMapper.selectByExample(null);
        return bookTypes;
    }

    @Override
    public List<Book> getBookByType(Integer id) {
        BookExample example=new BookExample();
        BookExample.Criteria criteria=example.createCriteria();
        criteria.andBookTypeidEqualTo(id);
        List<Book> books=bookMapper.selectByExampleWithAuthorAndBookType(example);
        return books;
    }
}
