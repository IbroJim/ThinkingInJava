package com.company.project.exampletwo.Chapter4;

import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Создайте класс с конструктором по умалчанию(без параметров), который выводит на экран сообщение." +
                "Создайте обьект этого класса");
    }

    @Override
    protected void run() {
      Test test=new Test();
    }


    @Override
    protected void nameProject() {
        System.out.println("1) Задание 3");
    }

    private class Test{
        Test(){
            System.out.println("Hello");
        }
    }

}
