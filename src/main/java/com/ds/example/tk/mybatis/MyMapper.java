package com.ds.example.tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author ds
 * @Date 2020/11/3 16:52
 * @Version 1.0
 * @Description
 */
public interface MyMapper<T> extends MySqlMapper<T>, Mapper<T> {
}
