package com.superlcb.test;

public class Genericity<T> {
    public T method(T t,Class<T> tClass){
        return (T)t;
    }
}
