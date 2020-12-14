package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.NewsCategoryMapper;
import com.zking.ssm.model.NewsCategory;
import com.zking.ssm.service.INewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-28 15:30
 */
@Service
public class INewsCategoryServiceImpl implements INewsCategoryService {
    @Autowired
    private NewsCategoryMapper newsCategoryMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(NewsCategory record) {
        return newsCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(NewsCategory record) {
        return 0;
    }

    @Override
    public NewsCategory selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(NewsCategory record) {
        return 0;
    }

    @Override
    public int select(NewsCategory record) {
        return newsCategoryMapper.select(record);
    }

    @Override
    public int updateByPrimaryKey(NewsCategory record) {
        return 0;
    }
}
