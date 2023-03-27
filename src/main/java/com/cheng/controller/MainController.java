package com.cheng.controller;

import com.cheng.entity.Emp;
import com.cheng.entity.Student;
import com.cheng.mapper.MainMapper;
import com.cheng.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>springboot-study</h3>
 *
 * @author cheng
 * @description <p>Controller类</p>
 * @date 2023-03-27 12:55
 */

@Controller
public class MainController {

    @Resource
    private MainMapper mainMapper;
    @Resource
    private TestService testService;

    @Value("${test.name}")
    String name;

    @GetMapping("/index")
    @ResponseBody
    public String index(){
        Logger logger = LoggerFactory.getLogger(MainController.class);
        logger.info("用户调用了index界面");
        testService.test();
        return "你好，欢迎来到主页!!!good";
    }

    @GetMapping("/student")
    @ResponseBody
    public Student student(){
        return new Student(1,name,"男");
    }

    @GetMapping("/employ")
    @ResponseBody
    public List<Emp> getAll(){
        return mainMapper.getAllEmp();
    }

}
