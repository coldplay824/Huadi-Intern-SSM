package cn.simple.web.controller;

import cn.simple.web.model.User;
import cn.simple.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    /**
     * 根据用户名获取用户信息
     *
     * @return 用户信息  返回格式={"user":{"id":1,"username":"admin","password":"1234"}}
     */
    @ResponseBody //返回json格式数据
    @RequestMapping(value = "/findByUsername", method = RequestMethod.GET)
    public Object login(@RequestParam("username") String username) {
        User user = iUserService.findByUsername(username);
        Map<String, User> resultMap = new HashMap<String, User>(1);
        resultMap.put("user", user);
        return resultMap;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<User> userList = iUserService.getAll();
        Map<String, List<User>> resultMap = new HashMap<String, List<User>>(1);
        resultMap.put("userList", userList);
        return new ModelAndView("user", resultMap);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public ModelAndView addUser() {
        return new ModelAndView("addUser");
    }


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        boolean bool = iUserService.insert(username, password);
        Map<String, Object> resultMap = new HashMap<String, Object>(3);
        resultMap.put("username", username);
        resultMap.put("password", password);
        resultMap.put("status", bool ? "添加成功" : "添加失败");
        return new ModelAndView("addUser", resultMap);
    }
}