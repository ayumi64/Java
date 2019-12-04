package com.example.demo.testng;

import org.testng.annotations.*;

public class demo {
    @BeforeClass
    public void setUp(){
        System.out.println("setUp!");
    }

    @Test
    public void helloWorld(){
        System.out.println("My first TestNG testCase!");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("tearDown!");
    }
}