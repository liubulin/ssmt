package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Order;
import com.zking.ssm.service.BaseTestCase;
import com.zking.ssm.service.ICustomerService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-27 14:41
 */
public class ICustomerServiceTest extends BaseTestCase {
    @Autowired
    private ICustomerService iCustomerService;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer =new Customer();
    }

    @Test
    public void insert() {
        customer.setCustomerId(null);
        customer.setCustomerName("ln");
        iCustomerService.insert(customer);
    }

    @Test
    public void queryOrderByCust() {
        customer.setCustomerId(2);
        List<Customer> lst = iCustomerService.queryOrderByCust(customer);
        lst.forEach(l->{
            System.out.println(l);
           List<Order> list = l.getOrders();
            for (Order o:list){
                System.out.println(o);
            }
        });


    }
}