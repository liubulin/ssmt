package com.zking.ssm.mapper;

import com.zking.ssm.model.Book;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List queryBook(Book record);
}