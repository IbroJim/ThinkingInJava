package com.company.project.exampletwo.Chapter2;

import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Создайте класс с полем типа float." +
                "Используйте его для демонстации совмещения имен при вызове метода ");
    }

    @Override
    protected void run() {
        Letter letter=new Letter();
        letter.a=10.1f;
        System.out.println(letter.a);
        f(letter);
        System.out.println(letter.a);

    }
    private static void f(Letter f){
        f.a=10.2f;
    }

    @Override
    protected void nameProject() {
        System.out.println("1) Задание 3 ");
    }
    private class Letter{
        float a;
    }
}
