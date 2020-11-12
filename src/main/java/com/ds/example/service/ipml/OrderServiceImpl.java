package com.ds.example.service.ipml;

import com.ds.example.bean.TbOrder;
import com.ds.example.mapper.OrderMapper;
import com.ds.example.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author ds
 * @Date 2020/11/12 20:34
 * @Version 1.0
 * @Description
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int insert(TbOrder order) {
        return orderMapper.insert(order);
    }

    @Override
    public List<TbOrder> findAll() {
        return orderMapper.selectAll();
    }
}
