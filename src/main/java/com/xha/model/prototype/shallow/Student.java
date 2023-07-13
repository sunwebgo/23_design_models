package com.xha.model.prototype.shallow;

/**
 * 学生
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
