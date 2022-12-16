package com.atguigu.boot.bean;

/**
 * @author ay.
 * @create 2022-12-16 17:58
 */
public class Pet {

    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
