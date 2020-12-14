package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.FileMapper;
import com.zking.ssm.model.File;
import com.zking.ssm.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-12-04 18:34
 */
@Service
public class IFileServiceImpl implements IFileService {
    @Autowired
    private FileMapper fileMapper;
    @Override
    public int deleteByPrimaryKey(String fileId) {
        return fileMapper.deleteByPrimaryKey(fileId);
    }

    @Override
    public int insert(File record) {
        return fileMapper.insert(record);
    }

    @Override
    public int insertSelective(File record) {
        return fileMapper.insertSelective(record);
    }

    @Override
    public File selectByPrimaryKey(String fileId) {
        return fileMapper.selectByPrimaryKey(fileId);
    }

    @Override
    public int updateByPrimaryKeySelective(File record) {
        return fileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(File record) {
        return fileMapper.updateByPrimaryKey(record);
    }
}
