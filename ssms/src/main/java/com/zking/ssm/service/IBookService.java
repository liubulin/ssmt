package com.zking.ssm.service;

import com.zking.ssm.model.Book;

import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-12-09 11:28
 */
public interface IBookService {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List queryBook(Book record);
}
