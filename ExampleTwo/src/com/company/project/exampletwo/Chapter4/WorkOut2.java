package com.company.project.exampletwo.Chapter4;

import com.company.project.exampletwo.HomeWork;

public class WorkOut2 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Создайте класс без конструктора.Создайте обьект этого класса в методе main(), " +
                "чтобы удостовериться, что конструктор по умалчанию синтезируется автоматически");
    }

    @Override
    protected void run() {
    Test test=new Test();
    }

    @Override
    protected void nameProject() {
        System.out.println("2) Задание 7");
    }

    private class Test{

    }
}
