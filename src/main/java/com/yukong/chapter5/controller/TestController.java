package com.yukong.chapter5.controller;

import com.yukong.chapter5.repository.TestMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author JinXueHai
 * @Date 2020/1/9
 * @Version V1.0
 **/
@RestController
public class TestController {

    @Resource
    private TestMapper testMapper;

    @RequestMapping("/selectAll1")
    public List<Map> selectAll1(){
        return testMapper.selectAll1();
    }

    @RequestMapping("/selectAll2")
    public List<Map> selectAll2(){
        return testMapper.selectAll2();
    }

    @RequestMapping("/selectAll3")
    public List<Map> selectAll3(){
        return testMapper.selectAll3();
    }

    @RequestMapping("/selectAll4")
    public List<Map> selectAll4(){
        return testMapper.selectAll4();
    }


}
