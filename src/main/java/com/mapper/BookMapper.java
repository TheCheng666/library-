package com.mapper;

import com.entity.AuthorExample;
import com.entity.Book;
import com.entity.BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    long countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    List<Book> selectByExampleWithAuthorAndBookType(BookExample example);

    List<Book> selectByExampleWithAuthorAndBookTypeByAuthor(String authorName);

    Book selectByPrimaryKeyWithAuthorAndBookType(Integer bookId);

    Book selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}