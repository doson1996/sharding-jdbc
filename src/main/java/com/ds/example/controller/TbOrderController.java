package com.ds.example.controller;

import cn.hutool.core.util.IdUtil;
import com.ds.example.bean.TbOrder;
import com.ds.example.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author ds
 * @Date 2020/11/3 16:38
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("order")
public class TbOrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("insert")
    public Map<String, Object> insert() {
        Map<String, Object> result = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            TbOrder order = new TbOrder();
            long id = IdUtil.getSnowflake(1, 1).nextId();
            order.setId(id+i);
            order.setUserId((long) i);
            order.setOrderId((long)i);
            orderService.insert(order);
        }

        result.put("code",200);
        result.put("msg","添加成功");
        return result;
    }

    @GetMapping("list")
    public Map<String, Object> list() {
        Map<String, Object> result = new HashMap<>();
        List<TbOrder> tbOrderList = orderService.findAll();
        tbOrderList = tbOrderList.stream().sorted(Comparator.comparing(TbOrder::getUserId)).collect(Collectors.toList());
        result.put("code",200);
        result.put("msg","数据条数："+tbOrderList.size());
        result.put("data",tbOrderList);
        return result;
    }
}
