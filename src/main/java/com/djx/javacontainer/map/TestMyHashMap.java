package com.djx.javacontainer.map;

/**
 * @author dong jing xi
 * @date 2020/7/26 23:47
 **/
public class TestMyHashMap {


    public static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {

        int i = tableSizeFor(1);
        System.out.println(i);

        int a = tableSizeFor(6);
        System.out.println(a);

        int b = tableSizeFor(14);
        System.out.println(b);

        int c = tableSizeFor(31);
        System.out.println(c);

        int d = tableSizeFor(60);
        System.out.println(d);

        int e = tableSizeFor(100);
        System.out.println(e);

    }

    static void test() {
        int maximumCapacity = 1 << 30;
        System.out.println(maximumCapacity);
    }


    static int tableSizeFor(int cap) {
        int n = cap - 1;
        // 无符号右移
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
        // 小于0 直接返回1  大于最大值直接返回最大值。其余就 + 1 后返回
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

}
