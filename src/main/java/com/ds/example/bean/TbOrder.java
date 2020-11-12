package com.ds.example.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author ds
 * @Date 2020/11/12 20:28
 * @Version 1.0
 * @Description
 */
@Data
@Table(name = "tb_order")
public class TbOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Long userId;
}
