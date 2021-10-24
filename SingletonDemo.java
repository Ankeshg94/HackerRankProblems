package com.ankesh.learning;

import java.io.Serializable;

public class SingletonDemo implements Serializable {
    private static final long serialVersionUID = 1L;

    SingletonDemo s = null;

    private SingletonDemo() {

    }

    private static class LazyHolder {
        private static final SingletonDemo INSTANCE = new SingletonDemo();
    }

    SingletonDemo getInstance(){
        return  LazyHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
