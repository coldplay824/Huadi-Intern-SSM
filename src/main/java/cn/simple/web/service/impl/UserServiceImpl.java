package cn.simple.web.service.impl;

import cn.simple.web.dao.UserDao;
import cn.simple.web.model.User;
import cn.simple.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    //有spring ioc管理bean，自动注入
    @Autowired
    private UserDao userDao;

    public boolean insert(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userDao.insert(user) > 0;
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User findByUsername(String username) {
        return userDao.selectByName(username);
    }
}
