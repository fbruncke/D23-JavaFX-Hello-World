package com.example.d23javafxhelloworld;

import java.util.function.Function;

public class Lazy<T> {
    private T value = null;
    private ConstWrapper<T> wrapperFunc;

    public Lazy(ConstWrapper<T> wrapperFunc) {
        this.wrapperFunc = wrapperFunc;
    }

    public T getValue() {
        return value = value==null?wrapperFunc.getInstance():value;
    }
}
