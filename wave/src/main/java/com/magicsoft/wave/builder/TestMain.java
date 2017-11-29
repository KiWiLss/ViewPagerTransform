package com.magicsoft.wave.builder;

import com.magicsoft.wave.builder.builder2.Student;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TestMain.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/11/29 10:45
 * @Changes (from 2017/11/29)
 * -----------------------------------------------------------------
 * 2017/11/29 : Create TestMain.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TestMain {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Person person = builder.setAge(9).create();


        Person.Builder builder1 = new Person.Builder();
        Person person1 = builder1.setAge(99).build();


        Student student = new Student.Builder().age(20).build();
        System.out.println(person.getAge()+"||"+person1.getAge()+"||"+student.getAge());
    }
}
