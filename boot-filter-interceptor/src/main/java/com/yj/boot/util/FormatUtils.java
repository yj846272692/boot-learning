package com.yj.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
public class FormatUtils {
    public static String forTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
