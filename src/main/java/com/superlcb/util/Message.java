package com.superlcb.util;

import java.util.Map;

public class Message {
    private Integer code=null;
    private Map msg=null;

    public Message() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map getMsg() {
        return msg;
    }

    public void setMsg(Map msg) {
        this.msg = msg;
    }
}
