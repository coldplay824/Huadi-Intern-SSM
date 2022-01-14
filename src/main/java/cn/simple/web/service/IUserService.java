package cn.simple.web.service;

import cn.simple.web.model.User;

import java.util.List;

public interface IUserService {
    /**
     * 新增用户
     */
    boolean insert(String username, String password);

    /**
     * 获取用户列表
     */
    List<User> getAll();

    /**
     * 根据用户名获取用户信息
     */
    User findByUsername(String username);
}
