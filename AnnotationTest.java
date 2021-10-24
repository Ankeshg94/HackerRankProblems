package com.ankesh.learning;

import java.lang.annotation.Annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        Class cls = Cipher.class;

        if(cls.getAnnotations() != null){
            for(Annotation ann: cls.getAnnotations()){
                System.out.println(ann.toString());

            }

        }
    }
}
