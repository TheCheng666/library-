import com.entity.AccountExample;
import com.entity.Book;
import com.entity.BrrowInfo;
import com.mapper.AccountMapper;
import com.mapper.BookMapper;
import com.mapper.BrrowInfoMapper;
import com.service.LoginAndRegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Base64;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class test {
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BrrowInfoMapper brrowInfoMapper;
    @Test
    public void test1(){
        String regx="(^[a-zA-Z0-9]{5,20}$)|(^[\\u2E80-\\u9FFF]{2,5})";//5-20位数字字母或2-5位中文
        String str="admin";
       System.out.println(str.matches(regx));
    }

    @Test
    public void test2(){
        String account="admin";
        AccountExample example=new AccountExample();
        AccountExample.Criteria criteria=example.createCriteria();
        criteria.andAccountEqualTo(account);
        long conut=accountMapper.countByExample(example);
        System.out.println(conut);
    }

    @Test
    public void test3(){
        List<Book> books=bookMapper.selectByExampleWithAuthorAndBookType(null);
        System.out.println(books.get(0));
    }

    @Test
    public void test4(){
        Book book=bookMapper.selectByPrimaryKeyWithAuthorAndBookType(9);
        System.out.println(book);
    }

    @Test
    public void test5(){
        List<BrrowInfo> brrowInfos=brrowInfoMapper.selectByExampleWithAccountAndBook(null);
        System.out.println(brrowInfos.get(0));
    }
}
