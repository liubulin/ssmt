package com.zking.ssm.service;

import com.zking.ssm.model.File;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-12-04 18:34
 */
public interface IFileService {
    int deleteByPrimaryKey(String fileId);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}
