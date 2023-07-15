package com.xha.patterns.creater.prototype.deep;


import java.io.Serializable;

/**
 * 奖状类
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Student getStu() {
        return stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学：在2023学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
