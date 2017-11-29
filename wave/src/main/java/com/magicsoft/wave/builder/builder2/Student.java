package com.magicsoft.wave.builder.builder2;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: Student.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 10:52
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create Student.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class Student {
    private String name;
    private int age;

    public Student(Builder builder) {
        builder.name = this.name;
        this.age=builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder{
        private String name;
        private int age;

      public Builder name(String name){
          this.name=name;
          return this;
      }

      public Builder age(int age){
          this.age=age;
          return this;
      }

      public Student build(){
          return new Student(this);
      }

    }
}
