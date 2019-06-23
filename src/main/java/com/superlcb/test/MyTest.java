package com.superlcb.test;

import com.superlcb.dao.UserDAO;
import com.superlcb.pojo.TestPOJO;
import com.superlcb.pojo.UserPOJO;
import com.superlcb.service.ShowAllUserService;
import com.superlcb.servicebase.ShowAllUser;
import com.superlcb.util.MyUtilTools;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class MyTest {
    private ApplicationContext context = null;
    private String springConfigPath = "config/spring.xml";
    @Autowired
    private TestPOJO testPOJO = null;


    public MyTest() {
    }

    public TestPOJO getTestPOJO() {
        return testPOJO;
    }

    public void setTestPOJO(TestPOJO testPOJO) {
        this.testPOJO = testPOJO;
    }

    @Before
    public void testBefore() {
        context = new ClassPathXmlApplicationContext(springConfigPath);
    }


    @Test
    public void testHelloSpring() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        MyUtilTools.myPrint(beanDefinitionNames);
    }

    @Test
    public void testAutoWire() {
        System.out.println(testPOJO);
        System.out.println(context.getBean("myTest", MyTest.class).testPOJO);
    }

    @Test
    public void testSpringIntegrationMybatis() {
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
        UserPOJO[] userPOJOS = userDAO.selectAllUser();
        MyUtilTools.myPrint(userPOJOS);
    }

    @Test
    public void testFirstService() {
        ShowAllUser showAllUser = context.getBean("allUserService", ShowAllUserService.class);
        showAllUser.show();
    }

    @Test
    public void testGenericity() {
        Genericity<UserPOJO> genericity = new Genericity<>();

//        boolean isOr = genericity.method(context.getBean("userPOJO")) instanceof UserPOJO;
//        UserPOJO userPOJO=context.getBean("userPOJO");
//        System.out.println(genericity.method().getPassword());
    }


}
