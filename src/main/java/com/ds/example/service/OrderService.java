package com.ds.example.service;

import com.ds.example.bean.TbOrder;

import java.util.List;

/**
 * @Author ds
 * @Date 2020/11/12 20:33
 * @Version 1.0
 * @Description
 */
public interface OrderService {
    int insert(TbOrder order);

    List<TbOrder> findAll();
}
