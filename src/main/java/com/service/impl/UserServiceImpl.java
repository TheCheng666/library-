package com.service.impl;

import com.entity.Book;
import com.entity.BrrowInfo;
import com.entity.BrrowInfoExample;
import com.mapper.BookMapper;
import com.mapper.BrrowInfoMapper;
import com.service.UserService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    BookMapper bookMapper;
    @Autowired
    BrrowInfoMapper brrowInfoMapper;

    @Override
    public boolean updateBookNum(Book book) {
        if (book.getBookNumber()>=0){
            Integer result=bookMapper.updateByPrimaryKeySelective(book);
            return result>0?true:false;
        }else {
            return false;
        }
    }

    @Override
    public Boolean insertBrrowInfo(BrrowInfo brrowInfo) {
        Integer result=brrowInfoMapper.insertSelective(brrowInfo);
        return result>0?true:false;
    }

    @Override
    public List<BrrowInfo> getBrrowInfo(Integer id) {
        BrrowInfoExample example=new BrrowInfoExample();
        example.setOrderByClause("status DESC");
        BrrowInfoExample.Criteria criteria=example.createCriteria();
        criteria.andUseridEqualTo(id);
        List<BrrowInfo> brrowInfos=brrowInfoMapper.selectByExampleWithAccountAndBook(example);
        return brrowInfos;
    }

    @Override
    public boolean updateBrrowInfo(BrrowInfo brrowInfo) {
       Integer result= brrowInfoMapper.updateByPrimaryKeySelective(brrowInfo);
       return result>0?true:false;
    }

    @Override
    public BrrowInfo getBrrowInfobyBroId(Integer broId) {
        BrrowInfo brrowInfo=brrowInfoMapper.selectByprimaryKeyWithAccountAndBook(broId);
        return brrowInfo;
    }

}
