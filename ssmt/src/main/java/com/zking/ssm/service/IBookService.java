package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-23 23:25
 */
@Transactional
public interface IBookService {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    int insertSelective(Book record);
@Transactional(readOnly = true)
//@Cacheable(value = "book")
    Book selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(Book record);
//    @CachePut(value = "book")
    Book updateByPrimaryKey(Book record);
@Transactional(readOnly = true)
    List queryAll(Book record);

}
