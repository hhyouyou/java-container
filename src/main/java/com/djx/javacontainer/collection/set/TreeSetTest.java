package com.djx.javacontainer.collection.set;

import java.util.TreeSet;

/**
 * @author dong jing xi
 * @date 2020/7/17 0:59
 **/
public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(-1);
        integers.add(3);
        integers.add(2);
        integers.add(1);

        System.out.println(integers.toString());

    }
}
