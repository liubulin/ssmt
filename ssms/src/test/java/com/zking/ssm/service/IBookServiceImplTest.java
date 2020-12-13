package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-12-09 14:01
 */
public class IBookServiceImplTest extends BaseTestCase{
    @Autowired
    private IBookService iBookService;
    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        book.setBookId(null);
        book.setBookName("hhhh");
        book.setBookAuthor("skjkjd");
        book.setBookCategoryId(null);
        book.setBookDesc("dsfj");
        book.setBookImage(null);
        book.setBookNamePinyin("skdf");
        //book.setDeployDatetime(null);
        book.setBookState(1);
        book.setPublishing(null);
        book.setSalesVolume(null);
        book.setBookPrice(null);
        System.out.println("hh"+book);
        iBookService.insert(book);
        System.out.println("OK");
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void queryBook() {
        book.setBookName("冷");
        List list =iBookService.queryBook(book);
        list.forEach(l->{
            System.out.println(l);
        });
    }
}