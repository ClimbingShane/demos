package com.shane.javauper.demos.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d{1,4}x\\d{1,4})");
        String content = "this is regex test and use 1920*1080 display. " +
                "http://www.163.com[lishan_1365@163.com]. " +
                "old display 1024x768 .";

        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            int count = matcher.groupCount();
            System.out.println("match! match count: " + count);
            for (int x = 0; x < count; ++x) {
                // only the first one
                System.out.println("[index " + x + "]" + matcher.group(x));
            }
        } else {
            System.out.println("can NOT match.");
        }

    }
}
