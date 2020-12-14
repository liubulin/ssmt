package com.zking.ssm.mapper;

import com.zking.ssm.model.News;
import com.zking.ssm.model.NewsCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);
@Transactional(readOnly = true)
    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    //int select ();
 @Transactional
    List queryNews(News record);
}