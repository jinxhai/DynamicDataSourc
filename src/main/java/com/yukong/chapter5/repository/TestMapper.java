package com.yukong.chapter5.repository;


import com.yukong.chapter5.annotation.DataSource;

import java.util.List;
import java.util.Map;

/**
    默认使用mysql
 */
//@DataSource("informix")
public interface TestMapper {


    /**
     * 查询所有信息
     * @return
     */
    @DataSource  //默认mysql数据源
    List<Map> selectAll1();

    /**
     * 查询所有信息
     * @return
     */
    @DataSource("informix")
    List<Map> selectAll2();

    /**
     * 查询所有信息
     * @return
     */
    @DataSource("gbase")
    List<Map> selectAll3();

    /**
     * 查询所有信息
     * @return
     */
    @DataSource("oracle")
    List<Map> selectAll4();

}
