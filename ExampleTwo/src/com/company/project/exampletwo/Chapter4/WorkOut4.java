package com.company.project.exampletwo.Chapter4;

import com.company.project.exampletwo.HomeWork;

public class WorkOut4 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Создайте класс, производный от String, инициализируемый в секции инициализации экземпляров");
    }

    @Override
    protected void run() {
        Test test1;
        Test test2;
        {
            test1=new Test(1);
            test2=new Test(2);
        }
    }

    @Override
    protected void nameProject() {
        System.out.println("4) Задание 15");
    }

    class Test{
     Test(int n){
         System.out.println("Test"+n);
     }
    }
}
