package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-24 11:22
 */
@Service
@Scope(value = "prototype")
public class IBookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int deleteByPrimaryKey(Long bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book selectByPrimaryKey(Long bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Book updateByPrimaryKey(Book record) {
        bookMapper.updateByPrimaryKey(record);
        return record;
    }

    @Override
    public List queryAll(Book record) {
        return bookMapper.queryAll(record);
    }

//    public BookMapper getBookMapper() {
//        return bookMapper;
//    }
//
//    public void setBookMapper(BookMapper bookMapper) {
//        this.bookMapper = bookMapper;
//    }
}
