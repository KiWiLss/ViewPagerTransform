package com.magicsoft.recycler.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ScreenUtil.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/14 15:56
 * @Changes (from 2017/12/14)
 * -----------------------------------------------------------------
 * 2017/12/14 : Create ScreenUtil.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ScreenUtil {

    /**

     * dp转px

     *

     * @param context

     * @param

     * @return

     */

    public static int dip2px(Context context, float dpVal)

    {

        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,

                dpVal, context.getResources().getDisplayMetrics());

    }

}
