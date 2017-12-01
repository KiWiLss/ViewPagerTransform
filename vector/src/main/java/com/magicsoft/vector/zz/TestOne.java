package com.magicsoft.vector.zz;

import com.magicsoft.vector.utils.RegularUtils;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: TestOne.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/1 14:16
 * @Changes (from 2017/12/1)
 * -----------------------------------------------------------------
 * 2017/12/1 : Create TestOne.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class TestOne {
    public static void main(String[] args) {

        RegularUtils.logObject(RegularUtils.isEmail("kiwilss@152.com"));
        RegularUtils.logObject(RegularUtils.isEmail("153@qq.com"));
//        RegularUtils.logObject(RegularUtils.isChinese2("形及丰富及ufkejfefj"));
//        RegularUtils.logObject(RegularUtils.isChinese2("形及丰富 及"));
//        RegularUtils.logObject(RegularUtils.isChinese3("形及丰富 及"));


    }
}
