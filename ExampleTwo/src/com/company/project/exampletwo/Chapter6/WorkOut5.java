package com.company.project.exampletwo.Chapter6;

import com.company.project.exampletwo.HomeWork;

public class WorkOut5 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Создайте класс с пустой final-ссылкой на обьект. Проведите инициализацию пустой константый во всех конструкторах" +
                "Продемонстрируйте гарантированную инициализацию final пред использованием и невозможность её изменения после инициализации");

    }


    @Override
    protected void run() {
        System.out.println("Мы не можем инициализировать final два раза!!! ");
        final A a=new A();

    }


    @Override
    protected void nameProject() {
        System.out.println("5) Задание 19");
    }

    private class A{
        private final int j;
        A(){
            j=1;
            System.out.println(j);
            //j=10 нельзя
        }

    }

}
