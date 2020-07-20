package com.service.impl;

import com.entity.*;
import com.mapper.AuthorMapper;
import com.mapper.BookMapper;
import com.mapper.BookTypeMapper;
import com.mapper.BrrowInfoMapper;
import com.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.apache.commons.codec.binary.Base64;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    AuthorMapper authorMapper;
    @Autowired
    BookTypeMapper bookTypeMapper;
    @Autowired
    BrrowInfoMapper brrowInfoMapper;

    @Override
    public boolean addBookAndAuthor(Book book, Author author) {
        Integer resultAuthor=authorMapper.insertSelective(author);
        if (resultAuthor>0){
            book.setAuthorid(author.getAuthorId());
            Integer resultBook=bookMapper.insertSelective(book);
            if (resultBook>0){
                return true;
            }else {
                System.out.println("图书信息插入失败");
                return false;
            }
        }else {
            System.out.println("作者信息插入失败");
            return false;
        }
    }


    @Override
    public boolean deleteManyBook(List<Integer> del_ids) {
        BookExample example=new BookExample();
        BookExample.Criteria criteria=example.createCriteria();
        criteria.andBookIdIn(del_ids);
        Integer result=bookMapper.deleteByExample(example);
        return result>0?true:false;
    }

    @Override
    public boolean deleteOneBook(Integer id) {
        Integer result=bookMapper.deleteByPrimaryKey(id);
        return result>0?true:false;
    }

    @Override
    public boolean updateBook(Book book,Author author) {
        Integer result=bookMapper.updateByPrimaryKeySelective(book);
        Integer result1=authorMapper.updateByPrimaryKeySelective(author);
        if (result>0&&result1>0){
            return true;
        }else {
            return false;
        }
    }



    @Override
    public List<BrrowInfo> getBrrowInfo() {
        BrrowInfoExample example=new BrrowInfoExample();
        example.setOrderByClause("status DESC");
        List<BrrowInfo> brrowInfos=brrowInfoMapper.selectByExampleWithAccountAndBook(example);
        return brrowInfos;
    }

    @Override
    public List<BrrowInfo> getBrrowInfoByAccount(String account) {
        List<BrrowInfo> brrowInfos=brrowInfoMapper.selectByExampleWithAccountAndBookByAccount(account);
        return brrowInfos;
    }


}
