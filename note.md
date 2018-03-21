# java学习笔记

## 2018-03-21

>简介

    java程序基本的组成单位是类，类中包裹属性和方法。每一个应用程序中都必须包含一个main()方法，含有main()方法的类称为主类。

>数据类型

    1.基本数据类型

    整数 byte short int long
    浮点 float double
    字符 char
    布尔 boolean

>声明常量是必须复制否则报错

    final int TEST;//报错

>变量的有效范围

    成员变量/全局变量 如果用static修饰符修饰可以在其他类中以`类名.变量名`来使用，都可以在整个类中使用
    局部变量 可以在类的方法中使用 如果跟成员变量名冲突，则取局部变量

>隐式装换

    涉及到低类型项高类型的转换，系统会自动执行，下列等级表
    数值类型:byte<short<int<long<float<double
    byte b = 1;short s = 2;byte+short//结果类型为short，因为short类型比byte高

>显式装换

    int number = 77;
    (char) number //可以将变量number输出成char类型的值。输出M 因为M在Unicode表中的排序位置是77 也可以通过 (int) 'M' => 得到77