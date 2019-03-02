package com.zp.designpattern.build.builder;

/**
 * Created by zhangpeng01 on 2019/1/15.
 */
public class Student {

    private String name;
    private int age;
    private int height;

    public Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
    }

    public static class Builder{
        private String name;
        private int age;
        private int height;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setHeight(int height){
            this.height = height;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}
