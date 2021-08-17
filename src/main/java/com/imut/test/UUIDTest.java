package com.imut.test;

import java.util.UUID;

/**
 * @author DJS
 * @create 2021-08-16  21:53
 */
public class UUIDTest {
    public static void main(String[] args) {

        /**
         * uuid是随机数
         * 原理是：时间戳+随机数+硬件编码
         */
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        System.out.println(str);
        System.out.println(str.length()); //36
    }
}
