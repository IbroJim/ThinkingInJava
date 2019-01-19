package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut8 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Напишите программу,которая демонстратирует, что независимо от количества созданных обьектов класс содержит только один экземпляр поля static");
    }

    @Override
    protected void run() {
        TestStatic one=new TestStatic();
        TestStatic twoo=new TestStatic();
        one.output();
        twoo.output();
        TestStatic.i+=100;
        one.output();
        twoo.output();
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 8");
    }

    private static class TestStatic{
        static  int i=100;

        void output(){
            System.out.println(i);
        }
    }
}
