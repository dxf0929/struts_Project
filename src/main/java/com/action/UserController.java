package com.action;

import com.opensymphony.xwork2.Action;

/*
 *创建日期：2020/10/18/14:19
 *创建人：dxf
 */
public class UserController {
    private String username;
    private String password;
    public String login(){

        if(!"".equals(username)) throw new RuntimeException("账号错误");
        System.out.println("账号正确");
        if(!"".equals(password)) throw new RuntimeException("密码错误");
        System.out.println("密码正确");
        return Action.SUCCESS;
    }
    
    public String queryByList(){
        
        
        
        return Action.SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
