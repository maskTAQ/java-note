//申明class Main所在的包
//文件名需要与类名同名
package com.company;

import java.lang.reflect.Array;

public class Main {
    //成员变量/全局变量
    static int v = 1;

    //public、static权限修饰符 void返回值修饰符 String[] args字符串类型的数组
    public static void main(String[] args) {
        //局部变量
        int vv = 1;
        int number = 77;
        char M = 'M';
        String c = String.format("%b",3>5);
        System.out.println( c.getClass().toString());
        System.out.println(v == vv);

        System.out.println(new StringBuilder("") == new StringBuilder(""));
        System.out.println((int) 'M');

        int arr[] = new int[]{0,2,2,3};
        int index = java.util.Arrays.binarySearch(arr,0,1,11);
        System.out.println(index);
    }
}
