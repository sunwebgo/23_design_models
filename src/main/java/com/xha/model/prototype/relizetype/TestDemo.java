package com.xha.model.prototype.relizetype;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {

        public static void main(String[] args) throws CloneNotSupportedException {
//            1.创建原型对象
            Realizetype realizetype = new Realizetype();
//            2.克隆原型对象
            Realizetype clone = realizetype.clone();
//            3.比较原型对象和克隆对象
            System.out.println(realizetype == clone);
        }
}
