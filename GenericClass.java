package com.ankesh.learning;

public class GenericClass {

    static <T> void add(T t1, T t2){
        System.out.println(t1);
    }


    public static void main(String[] args) {
        add(10,16);
    }
}
