package com.djx.javacontainer.collection.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 比较 TreeSet 和 HashSet 判断对象是否重复的方法
 *
 * @author dong jing xi
 * @date 2020/5/7 22:38
 **/
public class TreeSetSort {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("1.00");

        boolean equals = bigDecimal1.equals(bigDecimal2);// fasle
        int i = bigDecimal1.compareTo(bigDecimal2); // 0
        System.out.println("equals:" + equals + ", i:" + i);

        // HashSet  中比较两个对象使用的是，equals
        HashSet<BigDecimal> hashSet = new HashSet<>(8);
        hashSet.add(bigDecimal1);
        hashSet.add(bigDecimal2);

        System.out.println(hashSet.toString());// [1.00, 1.0]

        // TreeSet  中比较两个对象使用的是，compareTo
        TreeSet<BigDecimal> bigDecimals = new TreeSet<>();
        bigDecimals.add(bigDecimal1);
        bigDecimals.add(bigDecimal2);
        System.out.println(bigDecimals.toString());//[1.0]

    }
}
