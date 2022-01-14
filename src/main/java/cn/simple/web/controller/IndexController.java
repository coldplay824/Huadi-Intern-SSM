package cn.simple.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class IndexController {

    @RequestMapping("/index")
    public String list(HttpServletRequest request) {
        //调整到主页index.jsp页面
        return "index";
    }
}




