package cn.simple.web.dao;

import cn.simple.web.model.User;

import java.util.List;

public interface UserDao {
    //这里以接口形式定义了数据库操作方法,我们只需
    // 在Mybatis映射文件中对其进行映射就可以直接使用
    User selectById(int id);

    User selectByName(String username);

    List<User> getAll();

    int insert(User user);
}
