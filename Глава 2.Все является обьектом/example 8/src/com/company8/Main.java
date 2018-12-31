package com.company8;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestStatic one=new TestStatic();
        TestStatic twoo=new TestStatic();
        one.output();
        twoo.output();
        TestStatic.i+=100;
        one.output();
        twoo.output();
    }
}
