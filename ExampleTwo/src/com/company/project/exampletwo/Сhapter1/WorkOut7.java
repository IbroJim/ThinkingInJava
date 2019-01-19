package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut7 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Превратите фрагменты кода с классом Incrementable в работающую программу.");
    }

    @Override
    protected void run() {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 7");
    }

    static class  StaticTest{
        static int i=10;
    }
    static class Incrementable{
         static void increment() {
            StaticTest.i++;
        }
    }

}
