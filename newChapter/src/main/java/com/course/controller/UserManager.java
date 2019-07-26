package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Log4j
@RestController
@Api(value = "/v1",description = "用户管理系统")
@RequestMapping("/v1")
public class UserManager {


    //首先获取一个执行sql语句的对象

    @Autowired
    private SqlSessionTemplate template;

    @ApiOperation(value = "登陆接口", httpMethod = "GET")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public int login(User user) {
        int a = template.selectOne("login",user);
        log.info("查看到的结果是" + a);
        return a;
    }
}
