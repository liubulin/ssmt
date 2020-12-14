package com.zking.ssm.service;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.impl.IBookServiceImpl;
import com.zking.ssm.util.MybatisSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-24 19:58
 */

public class IBookServiceImplTest extends  BaseTestCase{
    @Autowired
    private IBookService iBookService;
    Book book;
    private SqlSession sqlSession;


    @Before
    public void setUp() throws Exception {
        book =new Book();
//        sqlSession = MybatisSessionFactoryUtils.openSession();
//        BookMapper bookMapper =sqlSession.getMapper(BookMapper.class);
//        IBookServiceImpl bookserviceImpl =new IBookServiceImpl();
//        bookserviceImpl.setBookMapper(bookMapper);
//        iBookService =bookserviceImpl;
    }

    @After
    public void tearDown() throws Exception {
//        sqlSession.commit();
    }

    @Test
    public void get(){
       Book b =iBookService.selectByPrimaryKey(1l);
        System.out.println(b);
        System.out.println("OK");

    }
@Test
    public void update(){
        book.setBookId(8l);
        book.setBookName("aaa111");
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
        iBookService.updateByPrimaryKey(book);
        System.out.println("OK");
    }

    @Test
    public void insert() {
        book.setBookId(null);
        book.setBookName("aa8a");
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
    public void queryAll() {
        book.setBookName("a");
        List list =iBookService.queryAll(book);
        list.forEach(l->{
            System.out.println(l);
        });
    }
}