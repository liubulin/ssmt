package com.zking.ssm.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class Customer {
    private Integer customerId;

    private String customerName;

    private List Orders;

    public List getOrders() {
        return Orders;
    }

    public void setOrders(List orders) {
        Orders = orders;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }
}