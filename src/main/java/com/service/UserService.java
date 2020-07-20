package com.service;

import com.entity.Book;
import com.entity.BrrowInfo;

import java.util.List;

public interface UserService {
    boolean updateBookNum(Book book);

    Boolean insertBrrowInfo(BrrowInfo brrowInfo);

    List<BrrowInfo> getBrrowInfo(Integer id);

    boolean updateBrrowInfo(BrrowInfo brrowInfo);

    BrrowInfo getBrrowInfobyBroId(Integer broId);
}
