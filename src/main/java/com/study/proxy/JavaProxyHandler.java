package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class JavaProxyHandler implements InvocationHandler {
    private Object target;

    public JavaProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method call before" + args[0]);
        int result = (int) method.invoke(target, args);
        System.out.println("method call after" + args[1]);
        return result;
    }
}