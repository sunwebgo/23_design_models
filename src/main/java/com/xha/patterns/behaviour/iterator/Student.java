package com.xha.patterns.behaviour.iterator;

/**
 * 学生
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Student {
    private String name;

    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
