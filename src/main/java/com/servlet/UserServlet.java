package com.servlet;

import com.dao.User;

public interface UserServlet {

    //根据id查询
    public User queryByName(String username);

    //删除用户
    public void deleteUser(String id);

    //添加
    public void insertUser(User user);

    //修改
    public void updateUser(User user);
}
