package com.superlcb.controller;


import com.superlcb.dao.UserDAO;
import com.superlcb.pojo.UserPOJO;
import com.superlcb.service.ShowAllUserService;
import com.superlcb.util.ContextUtil;
import com.superlcb.util.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;

import static com.superlcb.util.ContextUtil.getBean;

@RestController
public class ShowAllUserController {
    @GetMapping("/HelloSpringMVC/{variable}")
    public Message HelloSpringMVC(@PathVariable String variable, HttpServletRequest request) {
        System.out.println(variable);
        ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
        Message message = context.getBean("message", Message.class);
        message.setCode(200);
        Map map = new HashMap();
        map.put("AllUser", userDAO.selectAllUser());
        message.setMsg(map);
        return message;
    }

    @GetMapping("/HelloService")
    public Message HelloService(HttpServletRequest request) {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext()).getBean("allUserService", ShowAllUserService.class).showAllUsers();
    }
    @GetMapping("/HelloApplicationAware")
    public Message HelloApplicationAware(){
        return ContextUtil.context.getBean("allUserService",ShowAllUserService.class).showAllUsers();
    }
    @GetMapping("HelloSimpleApplicationAware")
    public Message HelloSimpleApplicationAware(){
        return ContextUtil.getBean("allUserService",ShowAllUserService.class).showAllUsers();
    }
}
