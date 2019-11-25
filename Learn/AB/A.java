
package com.abc;

public class A {

    public static void test() {

        System.out.println("A:test()");

    }

}

/*
#编译
javac -d . A.java B.java

#运行
java B

#输出
A:test()