package com.zking.ssm.service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zking.ssm.model.Category;
import com.zking.ssm.model.Customer;
import com.zking.ssm.model.News;
import com.zking.ssm.model.NewsCategory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-27 18:45
 */
public class INewsServiceImplTest extends BaseTestCase {
    @Autowired
    private INewsService iNewsService;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private INewsCategoryService iNewsCategoryService;
    private News news;
    private Category category;
    private NewsCategory newsCategory;


    @Before
    public void setUp() throws Exception {
        news= new News();
        category =new Category();
        newsCategory =new NewsCategory();
    }

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
        news.setNewsId(null);
        news.setTitle("121");
        iNewsService.insert(news);
        newsCategory.setId(null);
        List<News> list =iNewsService.queryNews(news);

        newsCategory.setId(null);
        newsCategory.setCid(2);
       // int i=iNewsService.select(news);
        //System.out.println("yy"+i);
       // newsCategory.setNid(i);
        System.out.println("jj"+newsCategory);
        iNewsCategoryService.insert(newsCategory);
        System.out.println("OK");


    }
@Test
public void select(){
    iNewsService.select();
    System.out.println(iNewsService.select());
}

    @Test
    public void queryNews() {
        news.setTitle("113");
        //news.setNewsId(2);
        List<News> list =iNewsService.queryNews(news);
        list.forEach(n->{
            System.out.println("OK");
            System.out.println(n);
            List lst =n.getCategory();
            lst.forEach(g->{
                System.out.println(g);
            });
        });


    }
}