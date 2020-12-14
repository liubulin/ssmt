package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.NewsMapper;
import com.zking.ssm.model.News;
import com.zking.ssm.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-27 19:10
 */
@Service
public class INewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return newsMapper.deleteByPrimaryKey(newsId);
    }

    @Override
    public int insert(News record) {
        return newsMapper.insert(record);
    }

    @Override
    public int insertSelective(News record) {
        return newsMapper.insertSelective(record);
    }

    @Override
    public News selectByPrimaryKey(Integer newsId) {
        return newsMapper.selectByPrimaryKey(newsId);
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return newsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryNews(News record) {
        return newsMapper.queryNews(record);
    }

    @Override
    public int select() {
        return 0;
    }

//    @Override
//    public int select() {
////        return newsMapper.select();
//        return newsMapper.s
//    }
}
