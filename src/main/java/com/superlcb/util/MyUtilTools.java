package com.superlcb.util;

import java.util.Arrays;

public class MyUtilTools {
    public static void myPrint(Object[] objects){
        Arrays.stream(objects).forEach(System.out::println);
    }
}
