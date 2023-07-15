package com.xha.patterns.behaviour.iterator;

/**
 * cliet
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
//        1.创建聚合类
        StudentAggregate studentAggregate = new StudentAggregateImpl();
//        2.添加学生
        studentAggregate.addStudent(new Student("张三", 18));
        studentAggregate.addStudent(new Student("李四", 19));
        studentAggregate.addStudent(new Student("王五", 20));

//        3.获取迭代器
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
//        4.遍历
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
