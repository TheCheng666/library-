package com.controller;

import com.entity.Book;
import com.entity.BookType;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.BookService;
import com.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Book")
public class BookController {
    @Autowired
    BookService bookService;
    /**
     * http://localhost:8080/Book/getBooks?pn=x
     * 分页查询图书信息和Author BookType联合查询
     * @param pn
     * @return
     */
    @RequestMapping("/getBooks")
    @ResponseBody
    public Msg getBooks(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        //要分页就要在查询之前调用PageHelper,传入页码，以及每页的大小
        PageHelper.startPage(pn,5);
        //startpage紧跟的查询就是分页查询
        List<Book> books=bookService.getBooks();
        //用pageInfo包装查询结果集,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(books,5);
        return Msg.success().add("page",pageInfo);
    }

    /**
     * http://localhost:8080/Book/getBookByName
     * 通过书名模糊查找
     * @param bookName
     * @return
     */
    @RequestMapping("/getBookByName")
    @ResponseBody
    public Msg getBookByName(String bookName){
        if (bookName!=null){
            List<Book> books=bookService.getBookByName(bookName);
            if (!books.isEmpty()){
                return Msg.success().add("bookByName",books);
            }else {
                return Msg.fail().add("err_msg","查询无结果！");
            }
        }else {
            return Msg.fail().add("err_msg","输入的书名查不到");
        }
    }

    /**http://localhost:8080/Book/getBookByAuthor
     *
     * 通过作者查询图书 要求作者全名
     * @param authorName
     * @return
     */
    @RequestMapping("/getBookByAuthor")
    @ResponseBody
    public Msg getBookByAuthor(String authorName){
        if (authorName!=null){
            List<Book> books=bookService.getBookByAuthor(authorName);
            if (!books.isEmpty()){
                return Msg.success().add("bookByAuthor",books);
            }else {
                return Msg.fail().add("err_msg","查询无结果！");
            }
        }else {
            return Msg.fail().add("err_msg","输入作者名为空！");
        }
    }


    /**
     * http://localhost:8080/Book/getBookType
     * 在增加book之前先获取booktype，以下拉列表显示
     * @return
     */
    @RequestMapping("/getBookType")
    @ResponseBody
    public Msg getBookType(){
        List<BookType> bookType =bookService.getBookType();
        return Msg.success().add("booktype",bookType);
    }
    /**
     * http://localhost:8080/Book/getBookById
     * 通过book_id查询
     * 在修改时回显调用
     * @param id
     * @return
     */
    @RequestMapping("/getBookById")
    @ResponseBody
    public Msg getBookById(Integer id){
        Book book=bookService.getBookById(id);
        return Msg.success().add("book",book);
    }
    /**
     * http://localhost:8080/Book/getBookByType
     * 通过类型查询 传入id
     * @param id
     * @return
     */
    @RequestMapping("/getBookByType")
    @ResponseBody
    public Msg getBookByType(Integer id){
        List<Book> books=bookService.getBookByType(id);
        if (!books.isEmpty()){
            return Msg.success().add("bookByType",books);
        }else {
            return Msg.success().add("err_msg","查询无结果！");
        }
    }
}
