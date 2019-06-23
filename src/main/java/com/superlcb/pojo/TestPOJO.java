package com.superlcb.pojo;

public class TestPOJO {
    private String Test=null;

    @Override
    public String toString() {
        return "TestPOJO{" +
                "Test='" + Test + '\'' +
                '}';
    }

    public TestPOJO() {
    }

    public TestPOJO(String test) {
        Test = test;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String test) {
        Test = test;
    }
}
