package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-27 14:34
 */
public interface ICustomerService {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);
    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List queryOrderByCust(Customer record);
}
