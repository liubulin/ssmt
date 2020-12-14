package com.zking.ssm.service;

import com.zking.ssm.model.News;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-27 18:42
 */
public interface INewsService {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);
    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List queryNews(News record);
    int select ();
}
