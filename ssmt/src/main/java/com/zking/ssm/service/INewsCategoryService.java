package com.zking.ssm.service;

import com.zking.ssm.model.NewsCategory;
import org.springframework.transaction.annotation.Transactional;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-28 15:29
 */
@Transactional
public interface INewsCategoryService {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);
@Transactional(readOnly = true)
    NewsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsCategory record);
    @Transactional(readOnly = true)
    int select (NewsCategory record);
    int updateByPrimaryKey(NewsCategory record);
}
