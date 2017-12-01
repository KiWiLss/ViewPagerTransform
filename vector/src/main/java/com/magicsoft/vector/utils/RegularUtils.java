package com.magicsoft.vector.utils;

import java.util.regex.Pattern;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: RegularUtils.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/1 14:17
 * @Changes (from 2017/12/1)
 * -----------------------------------------------------------------
 * 2017/12/1 : Create RegularUtils.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class RegularUtils {
    //匹配一个汉字
    static String oneChinest="[\\u4e00-\\u9fa5]";
    //匹配多个汉字,不包括空格
    static String chineseNo="[\\u4e00-\\u9fa5]+";
    //匹配多个汉字,包括空格
    static String chinese="[\\u4e00-\\u9fa5\\s]+";

    //匹配邮箱
    static String email="[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";



    public static boolean isChinese(String content){
        return Pattern.matches(oneChinest,content);
    }

    public static boolean isChinese2(String content){
        return Pattern.matches(chineseNo,content);
    }
    public static boolean isChinese3(String content){
        return Pattern.matches(chinese,content);
    }
    public static boolean isEmail(String input){
        return Pattern.matches(email,input);
    }

    public static void logObject(Object o){
        System.out.println(o.toString());
    }

}
