# java学习笔记

## 2018-03-21

>简介

    java程序基本的组成单位是类，类中包裹属性和方法。每一个应用程序中都必须包含一个main()方法，含有main()方法的类称为主类。

>数据类型

    1.基本数据类型

    整数 byte short int long
    浮点 float double
    字符 char String
    布尔 boolean
    
    2.引用类型的值
    字符串 StringBuilder String

>声明常量是必须赋值否则报错

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
    
## 2018-03-23

>作用域

    在java中可以只用{}(被包裹的称为复合语句)来实现单独的作用据。复合语句可以嵌套。

>条件语句的{}
    
    条件语句中的语句只有一条时或没有时{}可以省略(不建议)，但是需要以分号结尾
```java
boolean b = true;
if(b){int a;}
//去掉{}
if(v);
```
>foreach
    
    foreach并不是关键字。
```java
int arr[] = {7,8,9};
foreach(int i : arr){}
```

## 2018-03-25
    
>String为引用类型

    与js不同的是在java中js是引用类型的值，用==(java中没有全等===,==与js中的===使用方式一致)比较俩个相同的字符串是返回false的
```java
String a = "str";
String b = "Str";
a == b;//false
```
    使用equals或者equalsIgnore方法来比较俩个字符串的内容是否相等。
    
>StringBuilder类

    因为String为引用类型，所以频繁操作为增大内存的开销,使用此类可以高效的处理字符串。