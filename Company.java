package com.ankesh.learning.ImmutableDemo;

import java.util.ArrayList;
import java.util.List;

public final class Company {
    private final String name;
    private final List<String> dept;
    public Company(String name, List<String> dept) {
        this.name  = name;
        this.dept = new ArrayList<>(dept);
    }

    public String getName() {
        return name;
    }

    public List<String> getDept() {
        return  new ArrayList<>(dept);
    }
}
