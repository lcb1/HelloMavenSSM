package com.superlcb.util;

import com.superlcb.dao.UserDAO;

import java.util.Map;

public class BaseMessage {
    protected Message message=null;
    protected Map msg=null;
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Map getMsg() {
        return msg;
    }

    public void setMsg(Map msg) {
        this.msg = msg;
    }
}
