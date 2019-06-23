package com.superlcb.service;

import com.superlcb.dao.UserDAO;
import com.superlcb.pojo.UserPOJO;
import com.superlcb.servicebase.ShowAllUser;
import com.superlcb.util.BaseMessage;
import com.superlcb.util.Message;
import com.superlcb.util.MyUtilTools;

import java.util.Map;

public class ShowAllUserService extends BaseMessage implements ShowAllUser {
    private UserDAO userDAO=null;
    public UserDAO getUserDAO() {
        return userDAO;
    }
    public void show() {
        MyUtilTools.myPrint(userDAO.selectAllUser());
    }
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public Message showAllUsers() {
        System.out.println(msg);
        System.out.println(message);
        msg.put("AllUsers",userDAO.selectAllUser());
        message.setMsg(msg);
        return message;
    }
}
