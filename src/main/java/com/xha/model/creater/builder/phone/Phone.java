package com.xha.model.creater.builder.phone;


/**
 * 电话
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Phone {
    private String cpu;
    private String mainboard;
    private String memory;
    private String screen;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

//    私有化构造器,参数为Builder
    private Phone(Builder builder) {
//        将Builder中的属性赋值给Phone
        this.cpu = builder.cpu;
        this.mainboard = builder.mainboard;
        this.memory = builder.memory;
        this.screen = builder.screen;
    }
//    静态内部类,用于构建Phone对象,并且可以设置属性,最后调用build方法返回Phone对象
    public static final class Builder {
        private String cpu;
        private String mainboard;
        private String memory;
        private String screen;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
//        调用私有化构造器,返回Phone对象
        public Phone build() {
            return new Phone(this);
        }
    }
}
