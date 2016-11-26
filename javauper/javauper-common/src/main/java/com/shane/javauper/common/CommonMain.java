package com.shane.javauper.common;

import com.shane.javauper.common.date.DateUtil;

import java.util.Date;

public class CommonMain {
    public static void main(String[] args) {
        System.out.println(DateUtil.format(new Date(), DateUtil.FORMAT_DATE_TIME_DEFAULT));
    }
}
